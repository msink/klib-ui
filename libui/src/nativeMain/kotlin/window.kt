// SPDX-License-Identifier: MIT OR Apache-2.0

package libui.ktx

import cnames.structs.uiWindow
import kotlinx.cinterop.*
import libui.*
import libui.ktx.draw.SizeInt
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Represents a top-level window.
 *  Contains one child control that occupies the entirety of the window. */
class Window(
    title: String,
    width: Int,
    height: Int,
    hasMenubar: Boolean = false
) : Control<uiWindow>(uiNewWindow(title, width, height, if (hasMenubar) 1 else 0)),
    Container {

    /** Specify the control to show in content area.
     *  Window can contain only one control, if you need more use layouts like Box or GridPane */
    override fun <T : Control<*>> add(widget: T): T {
        uiWindowSetChild(ptr, widget.ctl)
        return widget
    }

    /** Set or return the text to show in window title bar. */
    var title: String
        get() = uiWindowTitle(ptr).uiText()
        set(title) = uiWindowSetTitle(ptr, title)

    /** Allow to specify that the window is a frameless one, without borders,
     *  title bar and OS window control widgets. */
    var borderless: Boolean
        get() = uiWindowBorderless(ptr) != 0
        set(borderless) = uiWindowSetBorderless(ptr, if (borderless) 1 else 0)

    /** Specify if the Window content should have a margin or not. */
    var margined: Boolean
        get() = uiWindowMargined(ptr) != 0
        set(margined) = uiWindowSetMargined(ptr, if (margined) 1 else 0)

    /** Whether the window should show in fullscreen or not. */
    var fullscreen: Boolean
        get() = uiWindowFullscreen(ptr) != 0
        set(fullscreen) = uiWindowSetFullscreen(ptr, if (fullscreen) 1 else 0)

    /** Size in pixel of the content area of the window.
     *  Window decoration size are excluded. This mean that if you set window size to 0,0
     *  you still see title bar and OS window buttons. */
    var contentSize: SizeInt
        get() = memScoped {
            val width = alloc<IntVar>()
            val height = alloc<IntVar>()
            uiWindowContentSize(ptr, width.ptr, height.ptr)
            SizeInt(width.value, height.value)
        }
        set(size) = uiWindowSetContentSize(ptr, size.width, size.height)

    /** Function to be run when window content size change. */
    fun onResize(block: Window.() -> Unit) {
        onResize = block
        uiWindowOnContentSizeChanged(ptr, staticCFunction { _, ref ->
            with(ref.to<Window>()) {
                onResize?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var onResize: (Window.() -> Unit)? = null

    /** Function to be run when the user clicks the Window's close button.
     *  Only one function can be registered at a time.
     *  @returns true if window is disposed */
    fun onClose(block: Window.() -> Boolean) {
        onClose = block
        uiWindowOnClosing(ptr, staticCFunction { _, ref ->
            with(ref.to<Window>()) {
                if (onClose?.invoke(this) ?: true) 1 else 0
            }
        }, ref.asCPointer())
    }

    internal var onClose: (Window.() -> Boolean)? = null
}

private lateinit var mainWindow: Window

/** Displays a modal Open File Dialog. */
fun OpenFileDialog(): String? {
    val rawName = uiOpenFile(mainWindow.ptr)
    if (rawName == null) return null
    val strName = rawName.toKString()
    uiFreeText(rawName)
    return strName
}

/** Displays a modal Open Folder Dialog. */
fun OpenFolderDialog(): String? {
    val rawName = uiOpenFolder(mainWindow.ptr)
    if (rawName == null) return null
    val strName = rawName.toKString()
    uiFreeText(rawName)
    return strName
}

/** Displays a modal Save File Dialog. */
fun SaveFileDialog(): String? {
    val rawName = uiSaveFile(mainWindow.ptr)
    if (rawName == null) return null
    val strName = rawName.toKString()
    uiFreeText(rawName)
    return strName
}

/** Displays a modal Message Box. */
fun MsgBox(text: String, details: String = "") = uiMsgBox(mainWindow.ptr, text, details)

/** Displays a modal Error Message Box. */
fun MsgBoxError(text: String, details: String = "") = uiMsgBoxError(mainWindow.ptr, text, details)

/**
 * Initializes package ui, runs `init` to set up the program,
 * and executes the GUI main loop. `init` should set up the program's
 * initial state: open the main window, create controls, and set up
 * events.
 */
fun appWindow(
    title: String,
    width: Int,
    height: Int,
    margined: Boolean = true,
    init: Window.() -> Unit = {}
) {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    platform.posix.srand(platform.posix.time(null).toUInt())

    memScoped {
        val options = alloc<uiInitOptions>()
        val error = uiInit(options.ptr)
        if (error != null) {
            val errorString = error.toKString()
            uiFreeInitError(error)
            throw Error("error initializing ui: '$errorString'")
        }
    }

    mainWindow = Window(title, width, height).apply {
        onClose { uiQuit(); true }
        onShouldQuit { dispose(); true }
        if (margined) this.margined = margined
        init()
        show()
    }

    uiMain()
    uiUninit()
    actions.forEach { it.dispose() }
}

private val actions = mutableListOf<StableRef<Any>>()

/** Function to be executed when the OS wants the program to quit
 *  or when a Quit menu item has been clicked.
 *  Only one function may be registered at a time.
 *  @returns `true` when Quit will be called. */
fun onShouldQuit(block: () -> Boolean) {
    val ref = StableRef.create(block).also { actions.add(it) }
    uiOnShouldQuit(staticCFunction { _ref ->
        val _block = _ref!!.asStableRef<() -> Boolean>().get()
        if (_block()) 1 else 0
    }, ref.asCPointer())
}

/** Function to be executed on a timer on the main thread.
 *  @returns `true` to continue and `false` to stop. */
fun onTimer(milliseconds: Int, block: () -> Boolean) {
    val ref = StableRef.create(block).also { actions.add(it) }
    uiTimer(milliseconds, staticCFunction { _ref ->
        val _block = _ref!!.asStableRef<() -> Boolean>().get()
        if (_block()) 1 else 0
    }, ref.asCPointer())
}
