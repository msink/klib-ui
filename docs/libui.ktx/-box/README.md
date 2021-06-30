[libui.ktx](../README.md) / [Box](README.md)

# Box

`abstract class Box(alloc: CPointer<`[`uiBox`](../../libui/ui-box.md)`>?) : `[`Control`](../-control/README.md)`<`[`uiBox`](../../libui/ui-box.md)`> , `[`Container`](../-container/README.md)

Wrapper class for [uiBox](../../libui/ui-box.md) - a container that stack its children horizontally or vertically.

### Constructors

| Name | Summary |
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

### Extension properties

| Name | Summary |
|---|---|
| [hbox](../hbox.md) | `val `[`Container`](../-container/README.md)`.hbox: `[`HBox`](../-h-box/README.md)<br>DSL builder for a container that stack its children horizontally. |
| [vbox](../vbox.md) | `val `[`Container`](../-container/README.md)`.vbox: `[`VBox`](../-v-box/README.md)<br>DSL builder for a container that stack its children vertically. |

### Extension functions

| Name | Summary |
|---|---|
| [button](../button.md) | `fun `[`Container`](../-container/README.md)`.button(text: String, init: `[`Button`](../-button/README.md)`.() -> Unit = {}): `[`Button`](../-button/README.md)<br>DSL builder for a simple button. |
| [checkbox](../checkbox.md) | `fun `[`Container`](../-container/README.md)`.checkbox(label: String, init: `[`Checkbox`](../-checkbox/README.md)`.() -> Unit = {}): `[`Checkbox`](../-checkbox/README.md)<br>DSL builder for a checkbox widget. |
| [colorbutton](../colorbutton.md) | `fun `[`Container`](../-container/README.md)`.colorbutton(init: `[`ColorButton`](../-color-button/README.md)`.() -> Unit = {}): `[`ColorButton`](../-color-button/README.md)<br>DSL builder for a button that opens a color palette popup. |
| [combobox](../combobox.md) | `fun `[`Container`](../-container/README.md)`.combobox(init: `[`Combobox`](../-combobox/README.md)`.() -> Unit = {}): `[`Combobox`](../-combobox/README.md)<br>DSL builder for a drop down combo box that allow list selection only. |
| [datepicker](../datepicker.md) | `fun `[`Container`](../-container/README.md)`.datepicker(init: `[`DatePicker`](../-date-picker/README.md)`.() -> Unit = {}): `[`DatePicker`](../-date-picker/README.md)<br>DSL builder for a widget to edit date. |
| [datetimepicker](../datetimepicker.md) | `fun `[`Container`](../-container/README.md)`.datetimepicker(init: `[`DateTimePicker`](../-date-time-picker/README.md)`.() -> Unit = {}): `[`DateTimePicker`](../-date-time-picker/README.md)<br>DSL builder for a widget to edit date and time. |
| [drawarea](../drawarea.md) | `fun `[`Container`](../-container/README.md)`.drawarea(init: `[`DrawArea`](../-draw-area/README.md)`.() -> Unit = {}): `[`DrawArea`](../-draw-area/README.md)<br>DSL builder for a canvas you can draw on. It also receives keyboard and mouse events, is DPI aware, and has several other useful features. |
| [editablecombobox](../editablecombobox.md) | `fun `[`Container`](../-container/README.md)`.editablecombobox(init: `[`EditableCombobox`](../-editable-combobox/README.md)`.() -> Unit = {}): `[`EditableCombobox`](../-editable-combobox/README.md)<br>DSL builder for a drop down combo box that allow selection from list or free text entry. |
| [fontbutton](../fontbutton.md) | `fun `[`Container`](../-container/README.md)`.fontbutton(init: `[`FontButton`](../-font-button/README.md)`.() -> Unit = {}): `[`FontButton`](../-font-button/README.md)<br>DSL builder for a button that allows users to choose a font when they click on it. |
| [form](../form.md) | `fun `[`Container`](../-container/README.md)`.form(padded: Boolean = true, init: `[`Form`](../-form/README.md)`.() -> Unit = {}): `[`Form`](../-form/README.md)<br>DSL builder for a container that organize children as labeled fields. |
| [gridpane](../gridpane.md) | `fun `[`Container`](../-container/README.md)`.gridpane(padded: Boolean = true, init: `[`GridPane`](../-grid-pane/README.md)`.() -> Unit = {}): `[`GridPane`](../-grid-pane/README.md)<br>DSL builder for a powerful container that allow to specify size and position of each children. |
| [group](../group.md) | `fun `[`Container`](../-container/README.md)`.group(title: String, margined: Boolean = true, init: `[`Group`](../-group/README.md)`.() -> Unit = {}): `[`Group`](../-group/README.md)<br>DSL builder for a container for a single widget that provide a caption and visually group it's children. |
| [hbox](../hbox.md) | `fun `[`Container`](../-container/README.md)`.hbox(padded: Boolean = true, init: `[`HBox`](../-h-box/README.md)`.() -> Unit = {}): `[`HBox`](../-h-box/README.md)<br>DSL builder for a container that stack its children horizontally. |
| [label](../label.md) | `fun `[`Container`](../-container/README.md)`.label(text: String, init: `[`Label`](../-label/README.md)`.() -> Unit = {}): `[`Label`](../-label/README.md)<br>DSL builder for a static text label. |
| [passwordfield](../passwordfield.md) | `fun `[`Container`](../-container/README.md)`.passwordfield(readonly: Boolean = false, init: `[`PasswordField`](../-password-field/README.md)`.() -> Unit = {}): `[`PasswordField`](../-password-field/README.md)<br>DSL builder for a text entry widget that mask the input, useful to edit passwords or other sensible data. |
| [progressbar](../progressbar.md) | `fun `[`Container`](../-container/README.md)`.progressbar(init: `[`ProgressBar`](../-progress-bar/README.md)`.() -> Unit = {}): `[`ProgressBar`](../-progress-bar/README.md)<br>DSL builder for a progress bar widget. |
| [radiobuttons](../radiobuttons.md) | `fun `[`Container`](../-container/README.md)`.radiobuttons(init: `[`RadioButtons`](../-radio-buttons/README.md)`.() -> Unit = {}): `[`RadioButtons`](../-radio-buttons/README.md)<br>DSL builder for a widget that represent a group of radio options. |
| [scrollingarea](../scrollingarea.md) | `fun `[`Container`](../-container/README.md)`.scrollingarea(width: Int, height: Int, init: `[`ScrollingArea`](../-scrolling-area/README.md)`.() -> Unit = {}): `[`ScrollingArea`](../-scrolling-area/README.md)<br>DSL builder for a canvas with horziontal and vertical scrollbars. |
| [searchfield](../searchfield.md) | `fun `[`Container`](../-container/README.md)`.searchfield(readonly: Boolean = false, init: `[`SearchField`](../-search-field/README.md)`.() -> Unit = {}): `[`SearchField`](../-search-field/README.md)<br>DSL builder for a text entry widget to search text. |
| [slider](../slider.md) | `fun `[`Container`](../-container/README.md)`.slider(min: Int, max: Int, init: `[`Slider`](../-slider/README.md)`.() -> Unit = {}): `[`Slider`](../-slider/README.md)<br>DSL builder for an horizontal slide to set numerical values. |
| [spinbox](../spinbox.md) | `fun `[`Container`](../-container/README.md)`.spinbox(min: Int, max: Int, init: `[`Spinbox`](../-spinbox/README.md)`.() -> Unit = {}): `[`Spinbox`](../-spinbox/README.md)<br>DSL builder for an entry widget for numerical values. |
| [tableview](../tableview.md) | `fun <T> `[`Container`](../-container/README.md)`.tableview(data: List<T>, init: `[`Table`](../-table/README.md)`<T>.() -> Unit = {}): `[`TableView`](../-table-view/README.md)<br>DSL builder to visualize data in a tabular form. |
| [tabpane](../tabpane.md) | `fun `[`Container`](../-container/README.md)`.tabpane(init: `[`TabPane`](../-tab-pane/README.md)`.() -> Unit = {}): `[`TabPane`](../-tab-pane/README.md)<br>DSL builder for a container that show each children in a separate tab. |
| [textarea](../textarea.md) | `fun `[`Container`](../-container/README.md)`.textarea(wrap: Boolean = true, init: `[`TextArea`](../-text-area/README.md)`.() -> Unit = {}): `[`TextArea`](../-text-area/README.md)<br>DSL builder for a multiline plain text editing widget. |
| [textfield](../textfield.md) | `fun `[`Container`](../-container/README.md)`.textfield(readonly: Boolean = false, init: `[`TextField`](../-text-field/README.md)`.() -> Unit = {}): `[`TextField`](../-text-field/README.md)<br>DSL builder for a simple single line text entry widget. |
| [timepicker](../timepicker.md) | `fun `[`Container`](../-container/README.md)`.timepicker(init: `[`TimePicker`](../-time-picker/README.md)`.() -> Unit = {}): `[`TimePicker`](../-time-picker/README.md)<br>DSL builder for a widget to edit time. |
| [vbox](../vbox.md) | `fun `[`Container`](../-container/README.md)`.vbox(padded: Boolean = true, init: `[`VBox`](../-v-box/README.md)`.() -> Unit = {}): `[`VBox`](../-v-box/README.md)<br>DSL builder for a container that stack its children vertically. |

### Inheritors

| Name | Summary |
|---|---|
| [HBox](../-h-box/README.md) | `class HBox : `[`Box`](README.md)<br>Wrapper class for [uiBox](../../libui/ui-box.md) - a container that stack its children horizontally. |
| [VBox](../-v-box/README.md) | `class VBox : `[`Box`](README.md)<br>Wrapper class for [uiBox](../../libui/ui-box.md) - a container that stack its children vertically. |
