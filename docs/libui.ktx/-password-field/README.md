[libui.ktx](../README.md) / [PasswordField](README.md)

# PasswordField

`class PasswordField : `[`TextField`](../-text-field/README.md)

Wrapper class for [uiEntry](../../libui/ui-entry.md) - a text entry widget that mask the input,
useful to edit passwords or other sensible data.

### Constructors

| | |
|---|---|
| [PasswordField](-password-field.md) | `fun PasswordField()` |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [enabled](../-control/enabled.md) | `var enabled: Boolean`<br>Whether the Control should be enabled or disabled. |
| [parent](../-control/parent.md) | `var parent: `[`Control`](../-control/README.md)`<*>?`<br>Returns parent of the control or `null` for detached. |
| [readonly](../-text-field/readonly.md) | `var readonly: Boolean`<br>Whether the text is read-only or not. |
| [toplevel](../-control/toplevel.md) | `val toplevel: Boolean`<br>Returns whether the control is a top level one or not. |
| [value](../-text-field/value.md) | `var value: String`<br>The current text of the TextField. |
| [visible](../-control/visible.md) | `var visible: Boolean`<br>Whether the Control should be visible or hidden. |

### Inherited functions

| Name | Summary |
|---|---|
| [action](../-text-field/action.md) | `fun action(block: `[`TextField`](../-text-field/README.md)`.() -> Unit)`<br>Function to be run when the user makes a change to the TextField. |
| [disable](../-control/disable.md) | `fun disable()`<br>Disables the Control. |
| [dispose](../-control/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated resources. |
| [enable](../-control/enable.md) | `fun enable()`<br>Enables the Control. |
| [getHandle](../-control/get-handle.md) | `fun getHandle(): ULong`<br>Returns the OS-level handle associated with this Control. |
| [hide](../-control/hide.md) | `fun hide()`<br>Hides the Control. |
| [isEnabled](../-control/is-enabled.md) | `fun isEnabled(): Boolean`<br>Whether the Control is enabled. |
| [isEnabledToUser](../-control/is-enabled-to-user.md) | `fun isEnabledToUser(): Boolean`<br>Whether the Control and all parents are enabled. |
| [isVisible](../-control/is-visible.md) | `fun isVisible(): Boolean`<br>Whether the Control is visible. |
| [show](../-control/show.md) | `fun show()`<br>Shows the Control. |
