[libui.ktx](../README.md) / [VBox](README.md)

# VBox

`class VBox : `[`Box`](../-box/README.md)

Wrapper class for [uiBox](../../libui/ui-box.md) - a container that stack its children vertically.

### Constructors

| | |
|---|---|
| [VBox](-v-box.md) | `fun VBox()` |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [enabled](../-control/enabled.md) | `var enabled: Boolean`<br>Whether the Control should be enabled or disabled. |
| [padded](../-box/padded.md) | `var padded: Boolean`<br>If `true`, the container insert some space between children. |
| [parent](../-control/parent.md) | `var parent: `[`Control`](../-control/README.md)`<*>?`<br>Returns parent of the control or `null` for detached. |
| [stretchy](../-box/stretchy.md) | `var stretchy: Boolean = false`<br>Next added child should expand to use all available size. |
| [toplevel](../-control/toplevel.md) | `val toplevel: Boolean`<br>Returns whether the control is a top level one or not. |
| [visible](../-control/visible.md) | `var visible: Boolean`<br>Whether the Control should be visible or hidden. |

### Inherited functions

| Name | Summary |
|---|---|
| [add](../-box/add.md) | `open fun <T : `[`Control`](../-control/README.md)`<*>> add(widget: T): T`<br>Adds the given widget to the end of the Box. |
| [delete](../-box/delete.md) | `fun delete(index: Int)`<br>Deletes the nth control of the Box. |
| [disable](../-control/disable.md) | `fun disable()`<br>Disables the Control. |
| [dispose](../-control/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated resources. |
| [enable](../-control/enable.md) | `fun enable()`<br>Enables the Control. |
| [getHandle](../-control/get-handle.md) | `fun getHandle(): ULong`<br>Returns the OS-level handle associated with this Control. |
| [hide](../-control/hide.md) | `fun hide()`<br>Hides the Control. |
| [isEnabled](../-control/is-enabled.md) | `fun isEnabled(): Boolean`<br>Whether the Control is enabled. |
| [isEnabledToUser](../-control/is-enabled-to-user.md) | `fun isEnabledToUser(): Boolean`<br>Whether the Control and all parents are enabled. |
| [isVisible](../-control/is-visible.md) | `fun isVisible(): Boolean`<br>Whether the Control is visible. |
| [show](../-control/show.md) | `fun show()`<br>Shows the Control. |

### Extensions

| Name | Summary |
|---|---|
| [separator](../separator.md) | `inline fun VBox.separator(init: `[`HorizontalSeparator`](../-horizontal-separator/README.md)`.() -> Unit = {}): `[`HorizontalSeparator`](../-horizontal-separator/README.md)<br>DSL builder for an horizontal line to visually separate widgets. |
