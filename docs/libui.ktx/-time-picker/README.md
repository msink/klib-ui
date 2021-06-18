[libui.ktx](../README.md) / [TimePicker](README.md)

# TimePicker

`class TimePicker : `[`DateTimePicker`](../-date-time-picker/README.md)

Wrapper class for [uiDateTimePicker](../../libui/ui-date-time-picker.md) - a widget to edit time.

### Constructors

| | |
|---|---|
| [TimePicker](-time-picker.md) | `fun TimePicker()` |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [enabled](../-control/enabled.md) | `var enabled: Boolean`<br>Whether the Control should be enabled or disabled. |
| [parent](../-control/parent.md) | `var parent: `[`Control`](../-control/README.md)`<*>?`<br>Returns parent of the control or `null` for detached. |
| [toplevel](../-control/toplevel.md) | `val toplevel: Boolean`<br>Returns whether the control is a top level one or not. |
| [value](../-date-time-picker/value.md) | `var value: time_t`<br>The current value in Unix epoch |
| [visible](../-control/visible.md) | `var visible: Boolean`<br>Whether the Control should be visible or hidden. |

### Inherited functions

| Name | Summary |
|---|---|
| [action](../-date-time-picker/action.md) | `fun action(block: `[`DateTimePicker`](../-date-time-picker/README.md)`.() -> Unit)`<br>Function to be run when the user makes a change to the Picker. |
| [disable](../-control/disable.md) | `fun disable()`<br>Disables the Control. |
| [dispose](../-control/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated resources. |
| [enable](../-control/enable.md) | `fun enable()`<br>Enables the Control. |
| [getHandle](../-control/get-handle.md) | `fun getHandle(): ULong`<br>Returns the OS-level handle associated with this Control. |
| [getValue](../-date-time-picker/get-value.md) | `fun getValue(value: CPointer<tm>)`<br>The current value as posix `struct tm` |
| [hide](../-control/hide.md) | `fun hide()`<br>Hides the Control. |
| [isEnabled](../-control/is-enabled.md) | `fun isEnabled(): Boolean`<br>Whether the Control is enabled. |
| [isEnabledToUser](../-control/is-enabled-to-user.md) | `fun isEnabledToUser(): Boolean`<br>Whether the Control and all parents are enabled. |
| [isVisible](../-control/is-visible.md) | `fun isVisible(): Boolean`<br>Whether the Control is visible. |
| [setValue](../-date-time-picker/set-value.md) | `fun setValue(value: CPointer<tm>)`<br>Set current value from posix `struct tm` |
| [show](../-control/show.md) | `fun show()`<br>Shows the Control. |
| [textValue](../-date-time-picker/text-value.md) | `fun textValue(format: String = defaultFormat): String`<br>The current value as String. |
