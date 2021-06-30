[libui.ktx](../README.md) / [Container](README.md)

# Container

`interface Container`

Container for child controls.

### Functions

| Name | Summary |
|---|---|
| [add](add.md) | `abstract fun <T : `[`Control`](../-control/README.md)`<*>> add(widget: T): T` |

### Inheritors

| Name |
|---|
| [Group](../-group/README.md) |
| [Box](../-box/README.md) |
| [Form](../-form/README.md) |
| [TabPane](../-tab-pane/-page/README.md) |
| [GridPane](../-grid-pane/README.md) |
| [Window](../-window/README.md) |

### Extensions

| Name | Summary |
|---|---|
| [button](../button.md) | `inline fun Container.button(text: String, init: `[`Button`](../-button/README.md)`.() -> Unit = {}): `[`Button`](../-button/README.md)<br>DSL builder for a simple button. |
| [checkbox](../checkbox.md) | `inline fun Container.checkbox(label: String, init: `[`Checkbox`](../-checkbox/README.md)`.() -> Unit = {}): `[`Checkbox`](../-checkbox/README.md)<br>DSL builder for a checkbox widget. |
| [colorbutton](../colorbutton.md) | `inline fun Container.colorbutton(init: `[`ColorButton`](../-color-button/README.md)`.() -> Unit = {}): `[`ColorButton`](../-color-button/README.md)<br>DSL builder for a button that opens a color palette popup. |
| [combobox](../combobox.md) | `inline fun Container.combobox(init: `[`Combobox`](../-combobox/README.md)`.() -> Unit = {}): `[`Combobox`](../-combobox/README.md)<br>DSL builder for a drop down combo box that allow list selection only. |
| [datepicker](../datepicker.md) | `inline fun Container.datepicker(init: `[`DatePicker`](../-date-picker/README.md)`.() -> Unit = {}): `[`DatePicker`](../-date-picker/README.md)<br>DSL builder for a widget to edit date. |
| [datetimepicker](../datetimepicker.md) | `inline fun Container.datetimepicker(init: `[`DateTimePicker`](../-date-time-picker/README.md)`.() -> Unit = {}): `[`DateTimePicker`](../-date-time-picker/README.md)<br>DSL builder for a widget to edit date and time. |
| [drawarea](../drawarea.md) | `fun Container.drawarea(init: `[`DrawArea`](../-draw-area/README.md)`.() -> Unit = {}): `[`DrawArea`](../-draw-area/README.md)<br>DSL builder for a canvas you can draw on. |
| [editablecombobox](../editablecombobox.md) | `inline fun Container.editablecombobox(init: `[`EditableCombobox`](../-editable-combobox/README.md)`.() -> Unit = {}): `[`EditableCombobox`](../-editable-combobox/README.md)<br>DSL builder for a drop down combo box that allow selection from list or free text entry. |
| [fontbutton](../fontbutton.md) | `inline fun Container.fontbutton(init: `[`FontButton`](../-font-button/README.md)`.() -> Unit = {}): `[`FontButton`](../-font-button/README.md)<br>DSL builder for a button that allows users to choose a font when they click on it. |
| [form](../form.md) | `inline fun Container.form(padded: Boolean = true, init: `[`Form`](../-form/README.md)`.() -> Unit = {}): `[`Form`](../-form/README.md)<br>DSL builder for a container that organize children as labeled fields. |
| [gridpane](../gridpane.md) | `inline fun Container.gridpane(padded: Boolean = true, init: `[`GridPane`](../-grid-pane/README.md)`.() -> Unit = {}): `[`GridPane`](../-grid-pane/README.md)<br>DSL builder for a powerful container that allow to specify size and position of each children. |
| [group](../group.md) | `fun Container.group(title: String, margined: Boolean = true, init: `[`Group`](../-group/README.md)`.() -> Unit = {}): `[`Group`](../-group/README.md)<br>DSL builder for a container for a single widget that provide a caption and visually group it's children. |
| [hbox](../hbox.md) | `val Container.hbox: `[`HBox`](../-h-box/README.md)<br>`inline fun Container.hbox(padded: Boolean = true, init: `[`HBox`](../-h-box/README.md)`.() -> Unit = {}): `[`HBox`](../-h-box/README.md)<br>DSL builder for a container that stack its children horizontally. |
| [label](../label.md) | `inline fun Container.label(text: String, init: `[`Label`](../-label/README.md)`.() -> Unit = {}): `[`Label`](../-label/README.md)<br>DSL builder for a static text label. |
| [passwordfield](../passwordfield.md) | `inline fun Container.passwordfield(readonly: Boolean = false, init: `[`PasswordField`](../-password-field/README.md)`.() -> Unit = {}): `[`PasswordField`](../-password-field/README.md)<br>DSL builder for a text entry widget that mask the input, useful to edit passwords or other sensible data. |
| [progressbar](../progressbar.md) | `inline fun Container.progressbar(init: `[`ProgressBar`](../-progress-bar/README.md)`.() -> Unit = {}): `[`ProgressBar`](../-progress-bar/README.md)<br>DSL builder for a progress bar widget. |
| [radiobuttons](../radiobuttons.md) | `inline fun Container.radiobuttons(init: `[`RadioButtons`](../-radio-buttons/README.md)`.() -> Unit = {}): `[`RadioButtons`](../-radio-buttons/README.md)<br>DSL builder for a widget that represent a group of radio options. |
| [scrollingarea](../scrollingarea.md) | `fun Container.scrollingarea(width: Int, height: Int, init: `[`ScrollingArea`](../-scrolling-area/README.md)`.() -> Unit = {}): `[`ScrollingArea`](../-scrolling-area/README.md)<br>DSL builder for a canvas with horziontal and vertical scrollbars. |
| [searchfield](../searchfield.md) | `inline fun Container.searchfield(readonly: Boolean = false, init: `[`SearchField`](../-search-field/README.md)`.() -> Unit = {}): `[`SearchField`](../-search-field/README.md)<br>DSL builder for a text entry widget to search text. |
| [slider](../slider.md) | `inline fun Container.slider(min: Int, max: Int, init: `[`Slider`](../-slider/README.md)`.() -> Unit = {}): `[`Slider`](../-slider/README.md)<br>DSL builder for an horizontal slide to set numerical values. |
| [spinbox](../spinbox.md) | `inline fun Container.spinbox(min: Int, max: Int, init: `[`Spinbox`](../-spinbox/README.md)`.() -> Unit = {}): `[`Spinbox`](../-spinbox/README.md)<br>DSL builder for an entry widget for numerical values. |
| [tableview](../tableview.md) | `inline fun <T> Container.tableview(data: List<T>, init: `[`Table`](../-table/README.md)`<T>.() -> Unit = {}): `[`TableView`](../-table-view/README.md)<br>DSL builder to visualize data in a tabular form. |
| [tabpane](../tabpane.md) | `inline fun Container.tabpane(init: `[`TabPane`](../-tab-pane/README.md)`.() -> Unit = {}): `[`TabPane`](../-tab-pane/README.md)<br>DSL builder for a container that show each children in a separate tab. |
| [textarea](../textarea.md) | `inline fun Container.textarea(wrap: Boolean = true, init: `[`TextArea`](../-text-area/README.md)`.() -> Unit = {}): `[`TextArea`](../-text-area/README.md)<br>DSL builder for a multiline plain text editing widget. |
| [textfield](../textfield.md) | `inline fun Container.textfield(readonly: Boolean = false, init: `[`TextField`](../-text-field/README.md)`.() -> Unit = {}): `[`TextField`](../-text-field/README.md)<br>DSL builder for a simple single line text entry widget. |
| [timepicker](../timepicker.md) | `inline fun Container.timepicker(init: `[`TimePicker`](../-time-picker/README.md)`.() -> Unit = {}): `[`TimePicker`](../-time-picker/README.md)<br>DSL builder for a widget to edit time. |
| [vbox](../vbox.md) | `val Container.vbox: `[`VBox`](../-v-box/README.md)<br>`inline fun Container.vbox(padded: Boolean = true, init: `[`VBox`](../-v-box/README.md)`.() -> Unit = {}): `[`VBox`](../-v-box/README.md)<br>DSL builder for a container that stack its children vertically. |
