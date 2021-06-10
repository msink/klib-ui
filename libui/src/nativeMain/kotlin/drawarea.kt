// SPDX-License-Identifier: MIT OR Apache-2.0

package libui.ktx

import cnames.structs.uiArea
import cnames.structs.uiDrawContext
import kotlinx.cinterop.*
import libui.*
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

typealias DrawContext = uiDrawContext
typealias AreaDrawParams = uiAreaDrawParams
typealias AreaMouseEvent = uiAreaMouseEvent

/** DSL builder for a canvas you can draw on. It also receives keyboard and mouse events,
 *  is DPI aware, and has several other useful features. */
fun Container.drawarea(
    init: DrawArea.() -> Unit = {}
): DrawArea {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(DrawArea().apply(init))
}

/** DSL builder for a canvas with horziontal and vertical scrollbars. */
fun Container.scrollingarea(
    width: Int,
    height: Int,
    init: ScrollingArea.() -> Unit = {}
): ScrollingArea {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(ScrollingArea(width, height).apply(init))
}

/** Wrapper class for [uiArea] - a canvas you can draw on. */
open class DrawArea(
    internal val handler: CPointer<ktAreaHandler> = nativeHeap.alloc<ktAreaHandler>().ptr,
    alloc: CPointer<uiArea>? = uiNewArea(handler.pointed.ui.ptr)
) : Control<uiArea>(alloc) {
    init {
        handler.pointed.ref = ref.asCPointer()
    }
    internal val disposables = mutableListOf<Disposable<*>>()
    override fun free() {
        disposables.forEach { it.dispose() }
        disposables.clear()
        nativeHeap.free(handler)
        super.free()
    }

    /** Funcion to be run when the area was created or got resized with [AreaDrawParams] as parameter.
     *  Only one function can be registered at a time. */
    fun draw(block: DrawContext.(params: AreaDrawParams) -> Unit) {
        draw = block
    }
    internal var draw: (DrawContext.(params: AreaDrawParams) -> Unit)? = null
    init {
        handler.pointed.ui.Draw = staticCFunction { handler, _, params ->
            with(handler!!.reinterpret<ktAreaHandler>().pointed.ref.to<DrawArea>()) {
                draw?.invoke(params!!.pointed.Context!!.pointed, params.pointed)
            }
        }
    }

    /** Funcion to be run when the mouse was moved or clicked over the area with [AreaMouseEvent] as parameter.
     *  Only one function can be registered at a time. */
    fun mouseEvent(block: DrawArea.(event: AreaMouseEvent) -> Unit) {
        mouseEvent = block
    }
    internal var mouseEvent: (DrawArea.(event: AreaMouseEvent) -> Unit)? = null
    init {
        handler.pointed.ui.MouseEvent = staticCFunction { handler, _, params ->
            with(handler!!.reinterpret<ktAreaHandler>().pointed.ref.to<DrawArea>()) {
                mouseEvent?.invoke(this, params!!.pointed)
            }
        }
    }

    /** Funcion to be run when the mouse entered (`left == false`) or left the area.
     *  Only one function can be registered at a time. */
    fun mouseCrossed(block: DrawArea.(left: Boolean) -> Unit) {
        mouseCrossed = block
    }
    internal var mouseCrossed: (DrawArea.(left: Boolean) -> Unit)? = null
    init {
        handler.pointed.ui.MouseCrossed = staticCFunction { handler, _, left ->
            with(handler!!.reinterpret<ktAreaHandler>().pointed.ref.to<DrawArea>()) {
                mouseCrossed?.invoke(this, left != 0)
            }
        }
    }

    /** Funcion to be run to indicate that a drag should be ended. Only implemented on Windows.
     *  Only one function can be registered at a time. */
    fun dragBroken(block: DrawArea.() -> Unit) {
        dragBroken = block
    }
    internal var dragBroken: (DrawArea.() -> Unit)? = null
    init {
        handler.pointed.ui.DragBroken = staticCFunction { handler, _ ->
            with(handler!!.reinterpret<ktAreaHandler>().pointed.ref.to<DrawArea>()) {
                dragBroken?.invoke(this)
            }
        }
    }

    /** Funcion to be run when a key was pressed. Return `true` to indicate that the key event was handled.
     *  (a menu item with that accelerator won't activate, no error sound on macOS). Event is an [uiAreaKeyEvent]
     *  Only one function can be registered at a time. */
    fun keyEvent(block: DrawArea.(event: uiAreaKeyEvent) -> Boolean) {
        keyEvent = block
    }
    internal var keyEvent: (DrawArea.(event: uiAreaKeyEvent) -> Boolean)? = null
    init {
        handler.pointed.ui.KeyEvent = staticCFunction { handler, _, event ->
            with(handler!!.reinterpret<ktAreaHandler>().pointed.ref.to<DrawArea>()) {
                if (keyEvent?.invoke(this, event!!.pointed) ?: false) 1 else 0
            }
        }
    }

    /** Queues the entire DrawArea for redraw.
     *  The DrawArea is not redrawn before this function returns; it is redrawn when next possible. */
    fun redraw() = uiAreaQueueRedrawAll(ptr)
}

/** Wrapper class for [uiArea] - a canvas with horziontal and vertical scrollbars. */
class ScrollingArea(
    width: Int,
    height: Int,
    handler: CPointer<ktAreaHandler> = nativeHeap.alloc<ktAreaHandler>().ptr,
    alloc: CPointer<uiArea>? = uiNewScrollingArea(handler.pointed.ui.ptr, width, height)
) : DrawArea(handler, alloc) {

    /** Sets the size of a ScrollingArea to the given size, in points. */
    fun setSize(width: Int, height: Int) =
        uiAreaSetSize(ptr, width, height)

    /** Scrolls the ScrollingArea to show the given rectangle. */
    fun scrollTo(x: Double, y: Double, width: Double, height: Double) =
        uiAreaScrollTo(ptr, x, y, width, height)
}

//// TODO document these can only be called within Mouse() handlers
//// TODO should these be allowed on scrolling areas?
//// TODO decide which mouse events should be accepted Down is the only one guaranteed to work right now
//// TODO what happens to events after calling this up to and including the next mouse up?
//// TODO release capture?
//void uiAreaBeginUserWindowMove(uiArea *a)
//void uiAreaBeginUserWindowResize(uiArea *a, uiWindowResizeEdge edge)
