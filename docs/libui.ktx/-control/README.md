[libui.ktx](../README.md) / [Control](README.md)

# Control

`abstract class Control<T : CPointed>(alloc: CPointer<T>?) : `[`Disposable`](../-disposable/README.md)`<T> `

Base class for all GUI controls (widgets).

### Constructors

| Name | Summary |
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

| Name | Summary |
|---|---|
| [Box](../-box/README.md) | `abstract class Box : Control<`[`uiBox`](../../libui/ui-box.md)`>, `[`Container`](../-container/README.md)<br>Wrapper class for [uiBox](../../libui/ui-box.md) - a container that stack its children horizontally or vertically. |
| [Button](../-button/README.md) | `class Button : Control<`[`uiButton`](../../libui/ui-button.md)`>`<br>Wrapper class for [uiButton](../../libui/ui-button.md) - a simple button. |
| [Checkbox](../-checkbox/README.md) | `class Checkbox : Control<`[`uiCheckbox`](../../libui/ui-checkbox.md)`>`<br>Wrapper class for [uiCheckbox](../../libui/ui-checkbox.md) - a checkbox widget. |
| [ColorButton](../-color-button/README.md) | `class ColorButton : Control<`[`uiColorButton`](../../libui/ui-color-button.md)`>`<br>Wrapper class for [uiColorButton](../../libui/ui-color-button.md) - a button that opens a color palette popup. |
| [Combobox](../-combobox/README.md) | `class Combobox : Control<`[`uiCombobox`](../../libui/ui-combobox.md)`>`<br>Wrapper class for [uiCombobox](../../libui/ui-combobox.md) - a drop down combo box that allow list selection only. |
| [DateTimePicker](../-date-time-picker/README.md) | `open class DateTimePicker : Control<`[`uiDateTimePicker`](../../libui/ui-date-time-picker.md)`>`<br>Wrapper class for [uiDateTimePicker](../../libui/ui-date-time-picker.md) - a widget to edit date and time. |
| [DrawArea](../-draw-area/README.md) | `open class DrawArea : Control<`[`uiArea`](../../libui/ui-area.md)`>`<br>Wrapper class for [uiArea](../../libui/ui-area.md) - a canvas you can draw on. |
| [EditableCombobox](../-editable-combobox/README.md) | `class EditableCombobox : Control<`[`uiEditableCombobox`](../../libui/ui-editable-combobox.md)`>`<br>Wrapper class for [uiEditableCombobox](../../libui/ui-editable-combobox.md) - a drop down combo box that allow selection from list or free text entry. |
| [FontButton](../-font-button/README.md) | `class FontButton : Control<`[`uiFontButton`](../../libui/ui-font-button.md)`>`<br>Wrapper class for [uiFontButton](../../libui/ui-font-button.md) - a button that allows users to choose a font. |
| [Form](../-form/README.md) | `class Form : Control<`[`uiForm`](../../libui/ui-form.md)`>, `[`Container`](../-container/README.md)<br>Wrapper class for [uiForm](../../libui/ui-form.md) - a container that organize children as labeled fields. |
| [GridPane](../-grid-pane/README.md) | `class GridPane : Control<`[`uiGrid`](../../libui/ui-grid.md)`>, `[`Container`](../-container/README.md)<br>Wrapper class for [uiGrid](../../libui/ui-grid.md) - a powerful container that allow to specify size and position of each children. |
| [Group](../-group/README.md) | `class Group : Control<`[`uiGroup`](../../libui/ui-group.md)`>, `[`Container`](../-container/README.md)<br>Wrapper class for [uiGroup](../../libui/ui-group.md) - a container for a single widget that provide a caption and visually group it's children. |
| [Label](../-label/README.md) | `class Label : Control<`[`uiLabel`](../../libui/ui-label.md)`>`<br>Wrapper class for [uiLabel](../../libui/ui-label.md) - a static text label. |
| [ProgressBar](../-progress-bar/README.md) | `class ProgressBar : Control<`[`uiProgressBar`](../../libui/ui-progress-bar.md)`>`<br>Wrapper class for [uiProgressBar](../../libui/ui-progress-bar.md) - a progress bar widget. |
| [RadioButtons](../-radio-buttons/README.md) | `class RadioButtons : Control<`[`uiRadioButtons`](../../libui/ui-radio-buttons.md)`>`<br>Wrapper class for [uiRadioButtons](../../libui/ui-radio-buttons.md) - a widget that represent a group of radio options. |
| [Separator](../-separator/README.md) | `abstract class Separator : Control<`[`uiSeparator`](../../libui/ui-separator.md)`>`<br>Wrapper class for [uiSeparator](../../libui/ui-separator.md) |
| [Slider](../-slider/README.md) | `class Slider : Control<`[`uiSlider`](../../libui/ui-slider.md)`>`<br>Wrapper class for [uiSlider](../../libui/ui-slider.md) - an horizontal slide to set numerical values. |
| [Spinbox](../-spinbox/README.md) | `class Spinbox : Control<`[`uiSpinbox`](../../libui/ui-spinbox.md)`>`<br>Wrapper class for [uiSpinbox](../../libui/ui-spinbox.md) - an entry widget for numerical values. |
| [TabPane](../-tab-pane/README.md) | `class TabPane : Control<`[`uiTab`](../../libui/ui-tab.md)`>`<br>Wrapper class for [uiTab](../../libui/ui-tab.md) - a container that show each children in a separate tab. |
| [TableView](../-table-view/README.md) | `class TableView : Control<`[`uiTable`](../../libui/ui-table.md)`>`<br>Wrapper class for [uiTable](../../libui/ui-table.md) |
| [TextArea](../-text-area/README.md) | `class TextArea : Control<`[`uiMultilineEntry`](../../libui/ui-multiline-entry.md)`>`<br>Wrapper class for [uiMultilineEntry](../../libui/ui-multiline-entry.md) - a multiline plain text editing widget |
| [TextField](../-text-field/README.md) | `open class TextField : Control<`[`uiEntry`](../../libui/ui-entry.md)`>`<br>Wrapper class for [uiEntry](../../libui/ui-entry.md) - a simple single line text entry widget |
| [Window](../-window/README.md) | `class Window : Control<`[`uiWindow`](../../libui/ui-window.md)`>, `[`Container`](../-container/README.md)<br>Represents a top-level window. Contains one child control that occupies the entirety of the window. |
