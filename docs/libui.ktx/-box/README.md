[libui.ktx](../README.md) / [Box](README.md)

# Box

`abstract class Box(alloc: CPointer<`[`uiBox`](../../libui/ui-box.md)`>?) : `[`Control`](../-control/README.md)`<`[`uiBox`](../../libui/ui-box.md)`> , `[`Container`](../-container/README.md)

Wrapper class for [uiBox](../../libui/ui-box.md) - a container that stack its children horizontally or vertically.

### Constructors

| | |
|---|---|
| [Box](-box.md) | `fun Box(alloc: CPointer<`[`uiBox`](../../libui/ui-box.md)`>?)` |

### Properties

| Name | Summary |
|---|---|
| [padded](padded.md) | `var padded: Boolean`<br>If `true`, the container insert some space between children. |
| [stretchy](stretchy.md) | `var stretchy: Boolean = false`<br>Next added child should expand to use all available size. |

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
| [add](add.md) | `open fun <T : `[`Control`](../-control/README.md)`<*>> add(widget: T): T`<br>Adds the given widget to the end of the Box. |
| [delete](delete.md) | `fun delete(index: Int)`<br>Deletes the nth control of the Box. |

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

### Inheritors

| Name |
|---|
| [HBox](../-h-box/README.md) |
| [VBox](../-v-box/README.md) |
