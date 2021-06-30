[libui.ktx](../README.md) / [Control](README.md)

# Control

`abstract class Control<T : CPointed>(alloc: CPointer<T>?) : `[`Disposable`](../-disposable/README.md)`<T> `

Base class for all GUI controls (widgets).

### Constructors

| | |
|---|---|
| [Control](-control.md) | `fun <T : CPointed> Control(alloc: CPointer<T>?)` |

### Properties

| Name | Summary |
|---|---|
| [enabled](enabled.md) | `var enabled: Boolean`<br>Whether the Control should be enabled or disabled. |
| [parent](parent.md) | `var parent: Control<*>?`<br>Returns parent of the control or `null` for detached. |
| [toplevel](toplevel.md) | `val toplevel: Boolean`<br>Returns whether the control is a top level one or not. |
| [visible](visible.md) | `var visible: Boolean`<br>Whether the Control should be visible or hidden. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Functions

| Name | Summary |
|---|---|
| [disable](disable.md) | `fun disable()`<br>Disables the Control. |
| [dispose](dispose.md) | `open fun dispose()`<br>Dispose and free all allocated resources. |
| [enable](enable.md) | `fun enable()`<br>Enables the Control. |
| [getHandle](get-handle.md) | `fun getHandle(): ULong`<br>Returns the OS-level handle associated with this Control. |
| [hide](hide.md) | `fun hide()`<br>Hides the Control. |
| [isEnabled](is-enabled.md) | `fun isEnabled(): Boolean`<br>Whether the Control is enabled. |
| [isEnabledToUser](is-enabled-to-user.md) | `fun isEnabledToUser(): Boolean`<br>Whether the Control and all parents are enabled. |
| [isVisible](is-visible.md) | `fun isVisible(): Boolean`<br>Whether the Control is visible. |
| [show](show.md) | `fun show()`<br>Shows the Control. |

### Inheritors

| Name |
|---|
| [DrawArea](../-draw-area/README.md) |
| [Group](../-group/README.md) |
| [Box](../-box/README.md) |
| [Form](../-form/README.md) |
| [TabPane](../-tab-pane/README.md) |
| [GridPane](../-grid-pane/README.md) |
| [TableView](../-table-view/README.md) |
| [TextField](../-text-field/README.md) |
| [TextArea](../-text-area/README.md) |
| [Checkbox](../-checkbox/README.md) |
| [Combobox](../-combobox/README.md) |
| [EditableCombobox](../-editable-combobox/README.md) |
| [Spinbox](../-spinbox/README.md) |
| [Slider](../-slider/README.md) |
| [RadioButtons](../-radio-buttons/README.md) |
| [DateTimePicker](../-date-time-picker/README.md) |
| [Label](../-label/README.md) |
| [Separator](../-separator/README.md) |
| [ProgressBar](../-progress-bar/README.md) |
| [Button](../-button/README.md) |
| [ColorButton](../-color-button/README.md) |
| [FontButton](../-font-button/README.md) |
| [Window](../-window/README.md) |
