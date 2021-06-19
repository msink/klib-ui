[libui.ktx](../README.md) / [RadioButtons](README.md)

# RadioButtons

`class RadioButtons : `[`Control`](../-control/README.md)`<`[`uiRadioButtons`](../../libui/ui-radio-buttons.md)`>`

Wrapper class for [uiRadioButtons](../../libui/ui-radio-buttons.md) - a widget that represent a group of radio options.

### Constructors

| Name | Summary |
|---|---|
| [RadioButtons](-radio-buttons.md) | `RadioButtons()` |

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `var value: Int`<br>Return or set the current selected option by index. |

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
| [action](action.md) | `fun action(block: RadioButtons.() -> Unit)`<br>Function to be run when the user makes a change to the RadioButtons. |
| [item](item.md) | `fun item(text: String)`<br>Adds the named button to the end of the radiobuttons. |

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
