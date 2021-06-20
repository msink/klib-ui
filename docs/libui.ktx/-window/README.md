[libui.ktx](../README.md) / [Window](README.md)

# Window

`class Window(title: String, width: Int, height: Int, hasMenubar: Boolean) : `[`Control`](../-control/README.md)`<`[`uiWindow`](../../libui/ui-window.md)`> , `[`Container`](../-container/README.md)

Represents a top-level window. Contains one child control that occupies the entirety of the window.

### Constructors

| | |
|---|---|
| [Window](-window.md) | `fun Window(title: String, width: Int, height: Int, hasMenubar: Boolean = false)` |

### Properties

| Name | Summary |
|---|---|
| [borderless](borderless.md) | `var borderless: Boolean`<br>Allow to specify that the window is a frameless one, without borders, title bar and OS window control widgets. |
| [contentSize](content-size.md) | `var contentSize: `[`SizeInt`](../../libui.ktx.draw/-size-int/README.md)<br>Size in pixel of the content area of the window. |
| [fullscreen](fullscreen.md) | `var fullscreen: Boolean`<br>Whether the window should show in fullscreen or not. |
| [margined](margined.md) | `var margined: Boolean`<br>Specify if the Window content should have a margin or not. |
| [title](title.md) | `var title: String`<br>Set or return the text to show in window title bar. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [enabled](../-control/enabled.md) | `var enabled: Boolean`<br>Whether the Control should be enabled or disabled. |
| [parent](../-control/parent.md) | `var parent: `[`Control`](../-control/README.md)`<*>?`<br>Returns parent of the control or `null` for detached. |
| [toplevel](../-control/toplevel.md) | `val toplevel: Boolean`<br>Returns whether the control is a top level one or not. |
| [visible](../-control/visible.md) | `var visible: Boolean`<br>Whether the Control should be visible or hidden. |

### Functions

| Name | Summary |
|---|---|
| [add](add.md) | `open fun <T : `[`Control`](../-control/README.md)`<*>> add(widget: T): T`<br>Specify the control to show in content area. |
| [onClose](on-close.md) | `fun onClose(block: Window.() -> Boolean)`<br>Function to be run when the user clicks the Window's close button. |
| [onResize](on-resize.md) | `fun onResize(block: Window.() -> Unit)`<br>Function to be run when window content size change. |

### Inherited functions

| Name | Summary |
|---|---|
| [disable](../-control/disable.md) | `fun disable()`<br>Disables the Control. |
| [dispose](../-control/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated resources. |
| [enable](../-control/enable.md) | `fun enable()`<br>Enables the Control. |
| [getHandle](../-control/get-handle.md) | `fun getHandle(): ULong`<br>Returns the OS-level handle associated with this Control. |
| [hide](../-control/hide.md) | `fun hide()`<br>Hides the Control. |
| [isEnabled](../-control/is-enabled.md) | `fun isEnabled(): Boolean`<br>Whether the Control is enabled. |
| [isEnabledToUser](../-control/is-enabled-to-user.md) | `fun isEnabledToUser(): Boolean`<br>Whether the Control and all parents are enabled. |
| [isVisible](../-control/is-visible.md) | `fun isVisible(): Boolean`<br>Whether the Control is visible. |
| [show](../-control/show.md) | `fun show()`<br>Shows the Control. |
