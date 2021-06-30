[libui.ktx](README.md)

# Package libui.ktx

### Types

| Name | Summary |
|---|---|
| [AreaDrawParams](-area-draw-params.md) | `typealias AreaDrawParams  =  `[`uiAreaDrawParams`](../libui/ui-area-draw-params/README.md) |
| [AreaMouseEvent](-area-mouse-event.md) | `typealias AreaMouseEvent  =  `[`uiAreaMouseEvent`](../libui/ui-area-mouse-event/README.md) |
| [Box](-box/README.md) | `abstract class Box(alloc: CPointer<`[`uiBox`](../libui/ui-box.md)`>?) : `[`Control`](-control/README.md)`<`[`uiBox`](../libui/ui-box.md)`> , `[`Container`](-container/README.md)<br>Wrapper class for [uiBox](../libui/ui-box.md) - a container that stack its children horizontally or vertically. |
| [Button](-button/README.md) | `class Button(text: String) : `[`Control`](-control/README.md)`<`[`uiButton`](../libui/ui-button.md)`> `<br>Wrapper class for [uiButton](../libui/ui-button.md) - a simple button. |
| [Checkbox](-checkbox/README.md) | `class Checkbox(label: String) : `[`Control`](-control/README.md)`<`[`uiCheckbox`](../libui/ui-checkbox.md)`> `<br>Wrapper class for [uiCheckbox](../libui/ui-checkbox.md) - a checkbox widget. |
| [ColorButton](-color-button/README.md) | `class ColorButton  :  `[`Control`](-control/README.md)`<`[`uiColorButton`](../libui/ui-color-button.md)`> `<br>Wrapper class for [uiColorButton](../libui/ui-color-button.md) - a button that opens a color palette popup. |
| [Combobox](-combobox/README.md) | `class Combobox  :  `[`Control`](-control/README.md)`<`[`uiCombobox`](../libui/ui-combobox.md)`> `<br>Wrapper class for [uiCombobox](../libui/ui-combobox.md) - a drop down combo box that allow list selection only. |
| [Container](-container/README.md) | `interface `[`Container`](-container/README.md)<br>Container for child controls. |
| [Control](-control/README.md) | `abstract class Control<T : CPointed>(alloc: CPointer<T>?) : `[`Disposable`](-disposable/README.md)`<T> `<br>Base class for all GUI controls (widgets). |
| [DatePicker](-date-picker/README.md) | `class DatePicker  :  `[`DateTimePicker`](-date-time-picker/README.md)<br>Wrapper class for [uiDateTimePicker](../libui/ui-date-time-picker.md) - a widget to edit date. |
| [DateTimePicker](-date-time-picker/README.md) | `open class DateTimePicker  :  `[`Control`](-control/README.md)`<`[`uiDateTimePicker`](../libui/ui-date-time-picker.md)`> `<br>Wrapper class for [uiDateTimePicker](../libui/ui-date-time-picker.md) - a widget to edit date and time. |
| [Disposable](-disposable/README.md) | `abstract class Disposable<T : CPointed>(alloc: CPointer<T>?)`<br>Base class for all objects that have a holder reference to the native C resource(s). |
| [DrawArea](-draw-area/README.md) | `open class DrawArea(handler: CPointer<`[`ktAreaHandler`](../libui/kt-area-handler/README.md)`>, alloc: CPointer<`[`uiArea`](../libui/ui-area.md)`>?) : `[`Control`](-control/README.md)`<`[`uiArea`](../libui/ui-area.md)`> `<br>Wrapper class for [uiArea](../libui/ui-area.md) - a canvas you can draw on. |
| [DrawContext](-draw-context.md) | `typealias DrawContext  =  `[`uiDrawContext`](../libui/ui-draw-context.md) |
| [EditableCombobox](-editable-combobox/README.md) | `class EditableCombobox  :  `[`Control`](-control/README.md)`<`[`uiEditableCombobox`](../libui/ui-editable-combobox.md)`> `<br>Wrapper class for [uiEditableCombobox](../libui/ui-editable-combobox.md) - a drop down combo box that allow selection from list or free text entry. |
| [FontButton](-font-button/README.md) | `class FontButton  :  `[`Control`](-control/README.md)`<`[`uiFontButton`](../libui/ui-font-button.md)`> `<br>Wrapper class for [uiFontButton](../libui/ui-font-button.md) - a button that allows users to choose a font. |
| [Form](-form/README.md) | `class Form  :  `[`Control`](-control/README.md)`<`[`uiForm`](../libui/ui-form.md)`> , `[`Container`](-container/README.md)<br>Wrapper class for [uiForm](../libui/ui-form.md) - a container that organize children as labeled fields. |
| [GridPane](-grid-pane/README.md) | `class GridPane  :  `[`Control`](-control/README.md)`<`[`uiGrid`](../libui/ui-grid.md)`> , `[`Container`](-container/README.md)<br>Wrapper class for [uiGrid](../libui/ui-grid.md) - a powerful container that allow to specify size and position of each children. |
| [Group](-group/README.md) | `class Group(title: String) : `[`Control`](-control/README.md)`<`[`uiGroup`](../libui/ui-group.md)`> , `[`Container`](-container/README.md)<br>Wrapper class for [uiGroup](../libui/ui-group.md) - a container for a single widget that provide a caption and visually group it's children. |
| [HBox](-h-box/README.md) | `class HBox  :  `[`Box`](-box/README.md)<br>Wrapper class for [uiBox](../libui/ui-box.md) - a container that stack its children horizontally. |
| [HorizontalSeparator](-horizontal-separator/README.md) | `class HorizontalSeparator  :  `[`Separator`](-separator/README.md)<br>Wrapper class for [uiSeparator](../libui/ui-separator.md) - an horizontal line to visually separate widgets. |
| [Label](-label/README.md) | `class Label(text: String) : `[`Control`](-control/README.md)`<`[`uiLabel`](../libui/ui-label.md)`> `<br>Wrapper class for [uiLabel](../libui/ui-label.md) - a static text label. |
| [Menu](-menu.md) | `typealias Menu = CPointer<`[`uiMenu`](../libui/ui-menu.md)`>` |
| [MenuItem](-menu-item.md) | `typealias MenuItem = CPointer<`[`uiMenuItem`](../libui/ui-menu-item.md)`>` |
| [PasswordField](-password-field/README.md) | `class PasswordField  :  `[`TextField`](-text-field/README.md)<br>Wrapper class for [uiEntry](../libui/ui-entry.md) - a text entry widget that mask the input, useful to edit passwords or other sensible data. |
| [ProgressBar](-progress-bar/README.md) | `class ProgressBar  :  `[`Control`](-control/README.md)`<`[`uiProgressBar`](../libui/ui-progress-bar.md)`> `<br>Wrapper class for [uiProgressBar](../libui/ui-progress-bar.md) - a progress bar widget. |
| [RadioButtons](-radio-buttons/README.md) | `class RadioButtons  :  `[`Control`](-control/README.md)`<`[`uiRadioButtons`](../libui/ui-radio-buttons.md)`> `<br>Wrapper class for [uiRadioButtons](../libui/ui-radio-buttons.md) - a widget that represent a group of radio options. |
| [ScrollingArea](-scrolling-area/README.md) | `class ScrollingArea(width: Int, height: Int, handler: CPointer<`[`ktAreaHandler`](../libui/kt-area-handler/README.md)`>, alloc: CPointer<`[`uiArea`](../libui/ui-area.md)`>?) : `[`DrawArea`](-draw-area/README.md)<br>Wrapper class for [uiArea](../libui/ui-area.md) - a canvas with horziontal and vertical scrollbars. |
| [SearchField](-search-field/README.md) | `class SearchField  :  `[`TextField`](-text-field/README.md)<br>Wrapper class for [uiEntry](../libui/ui-entry.md) - a text entry widget to search text. |
| [Separator](-separator/README.md) | `abstract class Separator(alloc: CPointer<`[`uiSeparator`](../libui/ui-separator.md)`>?) : `[`Control`](-control/README.md)`<`[`uiSeparator`](../libui/ui-separator.md)`> `<br>Wrapper class for [uiSeparator](../libui/ui-separator.md) |
| [Slider](-slider/README.md) | `class Slider(min: Int, max: Int) : `[`Control`](-control/README.md)`<`[`uiSlider`](../libui/ui-slider.md)`> `<br>Wrapper class for [uiSlider](../libui/ui-slider.md) - an horizontal slide to set numerical values. |
| [Spinbox](-spinbox/README.md) | `class Spinbox(min: Int, max: Int) : `[`Control`](-control/README.md)`<`[`uiSpinbox`](../libui/ui-spinbox.md)`> `<br>Wrapper class for [uiSpinbox](../libui/ui-spinbox.md) - an entry widget for numerical values. |
| [Table](-table/README.md) | `class Table<T>(data: List<T>, handler: CPointer<`[`ktTableHandler`](../libui/kt-table-handler/README.md)`>) : `[`Disposable`](-disposable/README.md)`<`[`uiTableModel`](../libui/ui-table-model.md)`> `<br>Wrapper class for [uiTableModel](../libui/ui-table-model.md) |
| [TableView](-table-view/README.md) | `class TableView(table: `[`Table`](-table/README.md)`<*>) : `[`Control`](-control/README.md)`<`[`uiTable`](../libui/ui-table.md)`> `<br>Wrapper class for [uiTable](../libui/ui-table.md) |
| [TabPane](-tab-pane/README.md) | `class TabPane  :  `[`Control`](-control/README.md)`<`[`uiTab`](../libui/ui-tab.md)`> `<br>Wrapper class for [uiTab](../libui/ui-tab.md) - a container that show each children in a separate tab. |
| [TextArea](-text-area/README.md) | `class TextArea(wrap: Boolean) : `[`Control`](-control/README.md)`<`[`uiMultilineEntry`](../libui/ui-multiline-entry.md)`> `<br>Wrapper class for [uiMultilineEntry](../libui/ui-multiline-entry.md) - a multiline plain text editing widget |
| [TextField](-text-field/README.md) | `open class TextField  :  `[`Control`](-control/README.md)`<`[`uiEntry`](../libui/ui-entry.md)`> `<br>Wrapper class for [uiEntry](../libui/ui-entry.md) - a simple single line text entry widget |
| [TimePicker](-time-picker/README.md) | `class TimePicker  :  `[`DateTimePicker`](-date-time-picker/README.md)<br>Wrapper class for [uiDateTimePicker](../libui/ui-date-time-picker.md) - a widget to edit time. |
| [VBox](-v-box/README.md) | `class VBox  :  `[`Box`](-box/README.md)<br>Wrapper class for [uiBox](../libui/ui-box.md) - a container that stack its children vertically. |
| [VerticalSeparator](-vertical-separator/README.md) | `class VerticalSeparator  :  `[`Separator`](-separator/README.md)<br>Wrapper class for [uiSeparator](../libui/ui-separator.md) - a vertical line to visually separate widgets. |
| [Window](-window/README.md) | `class Window(title: String, width: Int, height: Int, hasMenubar: Boolean) : `[`Control`](-control/README.md)`<`[`uiWindow`](../libui/ui-window.md)`> , `[`Container`](-container/README.md)<br>Represents a top-level window. |

### Properties

| Name | Summary |
|---|---|
| [hbox](hbox.md) | `val `[`Container`](-container/README.md)`.hbox: `[`HBox`](-h-box/README.md)<br>DSL builder for a container that stack its children horizontally. |
| [vbox](vbox.md) | `val `[`Container`](-container/README.md)`.vbox: `[`VBox`](-v-box/README.md)<br>DSL builder for a container that stack its children vertically. |

### Functions

| Name | Summary |
|---|---|
| [appWindow](app-window.md) | `fun appWindow(title: String, width: Int, height: Int, margined: Boolean = true, init: `[`Window`](-window/README.md)`.() -> Unit = {})`<br>Initializes package ui, runs `init` to set up the program, and executes the GUI main loop. |
| [button](button.md) | `inline fun `[`Container`](-container/README.md)`.button(text: String, init: `[`Button`](-button/README.md)`.() -> Unit = {}): `[`Button`](-button/README.md)<br>DSL builder for a simple button. |
| [checkbox](checkbox.md) | `inline fun `[`Container`](-container/README.md)`.checkbox(label: String, init: `[`Checkbox`](-checkbox/README.md)`.() -> Unit = {}): `[`Checkbox`](-checkbox/README.md)<br>DSL builder for a checkbox widget. |
| [colorbutton](colorbutton.md) | `inline fun `[`Container`](-container/README.md)`.colorbutton(init: `[`ColorButton`](-color-button/README.md)`.() -> Unit = {}): `[`ColorButton`](-color-button/README.md)<br>DSL builder for a button that opens a color palette popup. |
| [combobox](combobox.md) | `inline fun `[`Container`](-container/README.md)`.combobox(init: `[`Combobox`](-combobox/README.md)`.() -> Unit = {}): `[`Combobox`](-combobox/README.md)<br>DSL builder for a drop down combo box that allow list selection only. |
| [datepicker](datepicker.md) | `inline fun `[`Container`](-container/README.md)`.datepicker(init: `[`DatePicker`](-date-picker/README.md)`.() -> Unit = {}): `[`DatePicker`](-date-picker/README.md)<br>DSL builder for a widget to edit date. |
| [datetimepicker](datetimepicker.md) | `inline fun `[`Container`](-container/README.md)`.datetimepicker(init: `[`DateTimePicker`](-date-time-picker/README.md)`.() -> Unit = {}): `[`DateTimePicker`](-date-time-picker/README.md)<br>DSL builder for a widget to edit date and time. |
| [drawarea](drawarea.md) | `fun `[`Container`](-container/README.md)`.drawarea(init: `[`DrawArea`](-draw-area/README.md)`.() -> Unit = {}): `[`DrawArea`](-draw-area/README.md)<br>DSL builder for a canvas you can draw on. |
| [editablecombobox](editablecombobox.md) | `inline fun `[`Container`](-container/README.md)`.editablecombobox(init: `[`EditableCombobox`](-editable-combobox/README.md)`.() -> Unit = {}): `[`EditableCombobox`](-editable-combobox/README.md)<br>DSL builder for a drop down combo box that allow selection from list or free text entry. |
| [fontbutton](fontbutton.md) | `inline fun `[`Container`](-container/README.md)`.fontbutton(init: `[`FontButton`](-font-button/README.md)`.() -> Unit = {}): `[`FontButton`](-font-button/README.md)<br>DSL builder for a button that allows users to choose a font when they click on it. |
| [form](form.md) | `inline fun `[`Container`](-container/README.md)`.form(padded: Boolean = true, init: `[`Form`](-form/README.md)`.() -> Unit = {}): `[`Form`](-form/README.md)<br>DSL builder for a container that organize children as labeled fields. |
| [gridpane](gridpane.md) | `inline fun `[`Container`](-container/README.md)`.gridpane(padded: Boolean = true, init: `[`GridPane`](-grid-pane/README.md)`.() -> Unit = {}): `[`GridPane`](-grid-pane/README.md)<br>DSL builder for a powerful container that allow to specify size and position of each children. |
| [group](group.md) | `fun `[`Container`](-container/README.md)`.group(title: String, margined: Boolean = true, init: `[`Group`](-group/README.md)`.() -> Unit = {}): `[`Group`](-group/README.md)<br>DSL builder for a container for a single widget that provide a caption and visually group it's children. |
| [hbox](hbox.md) | `inline fun `[`Container`](-container/README.md)`.hbox(padded: Boolean = true, init: `[`HBox`](-h-box/README.md)`.() -> Unit = {}): `[`HBox`](-h-box/README.md)<br>DSL builder for a container that stack its children horizontally. |
| [label](label.md) | `inline fun `[`Container`](-container/README.md)`.label(text: String, init: `[`Label`](-label/README.md)`.() -> Unit = {}): `[`Label`](-label/README.md)<br>DSL builder for a static text label. |
| [MsgBox](-msg-box.md) | `fun MsgBox(text: String, details: String = "")`<br>Displays a modal Message Box. |
| [MsgBoxError](-msg-box-error.md) | `fun MsgBoxError(text: String, details: String = "")`<br>Displays a modal Error Message Box. |
| [onShouldQuit](on-should-quit.md) | `fun onShouldQuit(block: () -> Boolean)`<br>Function to be executed when the OS wants the program to quit or when a Quit menu item has been clicked. |
| [onTimer](on-timer.md) | `fun onTimer(milliseconds: Int, block: () -> Boolean)`<br>Function to be executed on a timer on the main thread. |
| [OpenFileDialog](-open-file-dialog.md) | `fun OpenFileDialog(): String?`<br>Displays a modal Open File Dialog. |
| [OpenFolderDialog](-open-folder-dialog.md) | `fun OpenFolderDialog(): String?`<br>Displays a modal Open Folder Dialog. |
| [page](page.md) | `inline fun `[`TabPane`](-tab-pane/README.md)`.page(label: String, margined: Boolean = true, init: `[`TabPane.Page`](-tab-pane/-page/README.md)`.() -> Unit = {}): `[`TabPane.Page`](-tab-pane/-page/README.md) |
| [passwordfield](passwordfield.md) | `inline fun `[`Container`](-container/README.md)`.passwordfield(readonly: Boolean = false, init: `[`PasswordField`](-password-field/README.md)`.() -> Unit = {}): `[`PasswordField`](-password-field/README.md)<br>DSL builder for a text entry widget that mask the input, useful to edit passwords or other sensible data. |
| [progressbar](progressbar.md) | `inline fun `[`Container`](-container/README.md)`.progressbar(init: `[`ProgressBar`](-progress-bar/README.md)`.() -> Unit = {}): `[`ProgressBar`](-progress-bar/README.md)<br>DSL builder for a progress bar widget. |
| [radiobuttons](radiobuttons.md) | `inline fun `[`Container`](-container/README.md)`.radiobuttons(init: `[`RadioButtons`](-radio-buttons/README.md)`.() -> Unit = {}): `[`RadioButtons`](-radio-buttons/README.md)<br>DSL builder for a widget that represent a group of radio options. |
| [random](random.md) | `fun random(): Int` |
| [SaveFileDialog](-save-file-dialog.md) | `fun SaveFileDialog(): String?`<br>Displays a modal Save File Dialog. |
| [scrollingarea](scrollingarea.md) | `fun `[`Container`](-container/README.md)`.scrollingarea(width: Int, height: Int, init: `[`ScrollingArea`](-scrolling-area/README.md)`.() -> Unit = {}): `[`ScrollingArea`](-scrolling-area/README.md)<br>DSL builder for a canvas with horziontal and vertical scrollbars. |
| [searchfield](searchfield.md) | `inline fun `[`Container`](-container/README.md)`.searchfield(readonly: Boolean = false, init: `[`SearchField`](-search-field/README.md)`.() -> Unit = {}): `[`SearchField`](-search-field/README.md)<br>DSL builder for a text entry widget to search text. |
| [separator](separator.md) | `inline fun `[`HBox`](-h-box/README.md)`.separator(init: `[`VerticalSeparator`](-vertical-separator/README.md)`.() -> Unit = {}): `[`VerticalSeparator`](-vertical-separator/README.md)<br>DSL builder for a vertical line to visually separate widgets.<br>`inline fun `[`VBox`](-v-box/README.md)`.separator(init: `[`HorizontalSeparator`](-horizontal-separator/README.md)`.() -> Unit = {}): `[`HorizontalSeparator`](-horizontal-separator/README.md)<br>DSL builder for an horizontal line to visually separate widgets. |
| [slider](slider.md) | `inline fun `[`Container`](-container/README.md)`.slider(min: Int, max: Int, init: `[`Slider`](-slider/README.md)`.() -> Unit = {}): `[`Slider`](-slider/README.md)<br>DSL builder for an horizontal slide to set numerical values. |
| [spinbox](spinbox.md) | `inline fun `[`Container`](-container/README.md)`.spinbox(min: Int, max: Int, init: `[`Spinbox`](-spinbox/README.md)`.() -> Unit = {}): `[`Spinbox`](-spinbox/README.md)<br>DSL builder for an entry widget for numerical values. |
| [tableview](tableview.md) | `inline fun <T> `[`Container`](-container/README.md)`.tableview(data: List<T>, init: `[`Table`](-table/README.md)`<T>.() -> Unit = {}): `[`TableView`](-table-view/README.md)<br>DSL builder to visualize data in a tabular form. |
| [tabpane](tabpane.md) | `inline fun `[`Container`](-container/README.md)`.tabpane(init: `[`TabPane`](-tab-pane/README.md)`.() -> Unit = {}): `[`TabPane`](-tab-pane/README.md)<br>DSL builder for a container that show each children in a separate tab. |
| [textarea](textarea.md) | `inline fun `[`Container`](-container/README.md)`.textarea(wrap: Boolean = true, init: `[`TextArea`](-text-area/README.md)`.() -> Unit = {}): `[`TextArea`](-text-area/README.md)<br>DSL builder for a multiline plain text editing widget. |
| [textfield](textfield.md) | `inline fun `[`Container`](-container/README.md)`.textfield(readonly: Boolean = false, init: `[`TextField`](-text-field/README.md)`.() -> Unit = {}): `[`TextField`](-text-field/README.md)<br>DSL builder for a simple single line text entry widget. |
| [timepicker](timepicker.md) | `inline fun `[`Container`](-container/README.md)`.timepicker(init: `[`TimePicker`](-time-picker/README.md)`.() -> Unit = {}): `[`TimePicker`](-time-picker/README.md)<br>DSL builder for a widget to edit time. |
| [vbox](vbox.md) | `inline fun `[`Container`](-container/README.md)`.vbox(padded: Boolean = true, init: `[`VBox`](-v-box/README.md)`.() -> Unit = {}): `[`VBox`](-v-box/README.md)<br>DSL builder for a container that stack its children vertically. |
