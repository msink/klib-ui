[libui.ktx](../README.md) / [Form](README.md)

# Form

`class Form : `[`Control`](../-control/README.md)`<`[`uiForm`](../../libui/ui-form.md)`> , `[`Container`](../-container/README.md)

Wrapper class for [uiForm](../../libui/ui-form.md) - a container that organize children as labeled fields.

### Constructors

| | |
|---|---|
| [Form](-form.md) | `fun Form()` |

### Properties

| Name | Summary |
|---|---|
| [label](label.md) | `var label: String`<br>Label for next added child |
| [padded](padded.md) | `var padded: Boolean`<br>If true, the container insert some space between children. |
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
| [add](add.md) | `open fun <T : `[`Control`](../-control/README.md)`<*>> add(widget: T): T`<br>Adds the given widget to the end of the form. |
| [delete](delete.md) | `fun delete(index: Int)`<br>deletes the nth control of the form. |

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
