// SPDX-License-Identifier: MIT OR Apache-2.0

package libui.ktx

import cnames.structs.uiButton
import cnames.structs.uiCheckbox
import cnames.structs.uiColorButton
import cnames.structs.uiCombobox
import cnames.structs.uiDateTimePicker
import cnames.structs.uiEditableCombobox
import cnames.structs.uiEntry
import cnames.structs.uiFontButton
import cnames.structs.uiLabel
import cnames.structs.uiMultilineEntry
import cnames.structs.uiProgressBar
import cnames.structs.uiRadioButtons
import cnames.structs.uiSeparator
import cnames.structs.uiSlider
import cnames.structs.uiSpinbox
import kotlinx.cinterop.*
import libui.*
import libui.ktx.draw.Color
import libui.ktx.draw.Font
import platform.posix.*
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

///////////////////////////////////////////////////////////////////////////////
//
// Data entry widgets:
// - [textfield]
// - [passwordfield]
// - [searchfield]
// - [textarea]
// - [checkbox]
// - [combobox]
// - [editablecombobox]
// - [spinbox]
// - [slider]
// - [radiobuttons]
// - [datepicker]
// - [timepicker]
// - [datetimepicker]
//
// Static widgets:
// - [label]
// - [separator]
// - [progressbar]
//
// Buttons:
// - [button]
// - [colorbutton]
// - [fontbutton]
//
///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a simple single line text entry widget. */
inline fun Container.textfield(
    readonly: Boolean = false,
    init: TextField.() -> Unit = {}
): TextField {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(TextField()
        .apply { if (readonly) this.readonly = readonly }
        .apply(init))
}

/** DSL builder for a text entry widget that mask the input,
 *  useful to edit passwords or other sensible data. */
inline fun Container.passwordfield(
    readonly: Boolean = false,
    init: PasswordField.() -> Unit = {}
): PasswordField {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(PasswordField()
        .apply { if (readonly) this.readonly = readonly }
        .apply(init))
}

/** DSL builder for a text entry widget to search text. */
inline fun Container.searchfield(
    readonly: Boolean = false,
    init: SearchField.() -> Unit = {}
): SearchField {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(SearchField()
        .apply { if (readonly) this.readonly = readonly }
        .apply(init))
}

/** Wrapper class for [uiEntry] - a simple single line text entry widget */
open class TextField internal constructor(alloc: CPointer<uiEntry>?) : Control<uiEntry>(alloc) {
    constructor() : this(uiNewEntry())

    /** The current text of the TextField. */
    var value: String
        get() = uiEntryText(ptr).uiText()
        set(value) = uiEntrySetText(ptr, value)

    /** Whether the text is read-only or not. Defaults to `false`. */
    var readonly: Boolean
        get() = uiEntryReadOnly(ptr) != 0
        set(readonly) = uiEntrySetReadOnly(ptr, if (readonly) 1 else 0)

    /** Function to be run when the user makes a change to the TextField.
     *  Only one function can be registered at a time. */
    fun action(block: TextField.() -> Unit) {
        action = block
        uiEntryOnChanged(ptr, staticCFunction { _, ref ->
            with(ref.to<TextField>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (TextField.() -> Unit)? = null
}

/** Wrapper class for [uiEntry] - a text entry widget that mask the input,
 *  useful to edit passwords or other sensible data. */
class PasswordField : TextField(uiNewPasswordEntry())

/** Wrapper class for [uiEntry] - a text entry widget to search text. */
class SearchField : TextField(uiNewSearchEntry())

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a multiline plain text editing widget.
 *  @param[wrap] enables the wrapping of the text when it reaches the edge of the area
 *  @param[readonly] specifies that a text should be read-only */
inline fun Container.textarea(
    wrap: Boolean = true,
    init: TextArea.() -> Unit = {}
): TextArea {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(TextArea(wrap).apply(init))
}

/** Wrapper class for [uiMultilineEntry] - a multiline plain text editing widget */
class TextArea(wrap: Boolean = true) : Control<uiMultilineEntry>(
    if (wrap) uiNewMultilineEntry() else uiNewNonWrappingMultilineEntry()
) {

    /** The current text in the area. */
    var value: String
        get() = uiMultilineEntryText(ptr).uiText()
        set(value) = uiMultilineEntrySetText(ptr, value)

    /** Whether the text is read-only or not. Defaults to `false` */
    var readonly: Boolean
        get() = uiMultilineEntryReadOnly(ptr) != 0
        set(readonly) = uiMultilineEntrySetReadOnly(ptr, if (readonly) 1 else 0)

    /** Adds the text to the end of the area. */
    fun append(text: String) = uiMultilineEntryAppend(ptr, text)

    /** Function to be run when the user makes a change to the TextArea.
     *  Only one function can be registered at a time. */
    fun action(block: TextArea.() -> Unit) {
        action = block
        uiMultilineEntryOnChanged(ptr, staticCFunction { _, ref ->
            with(ref.to<TextArea>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (TextArea.() -> Unit)? = null
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a checkbox widget. */
inline fun Container.checkbox(
    label: String,
    init: Checkbox.() -> Unit = {}
): Checkbox {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(Checkbox(label).apply(init))
}

/** Wrapper class for [uiCheckbox] - a checkbox widget. */
class Checkbox(label: String) : Control<uiCheckbox>(uiNewCheckbox(label)) {

    /** The static text of the checkbox. */
    var label: String
        get() = uiCheckboxText(ptr).uiText()
        set(label) = uiCheckboxSetText(ptr, label)

    /** Whether the checkbox is checked or unchecked. Defaults to `false`. */
    var value: Boolean
        get() = uiCheckboxChecked(ptr) != 0
        set(value) = uiCheckboxSetChecked(ptr, if (value) 1 else 0)

    /** Function to be run when the user clicks the Checkbox.
     *  Only one function can be registered at a time. */
    fun action(block: Checkbox.() -> Unit) {
        action = block
        uiCheckboxOnToggled(ptr, staticCFunction { _, ref ->
            with(ref.to<Checkbox>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (Checkbox.() -> Unit)? = null
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a drop down combo box that allow list selection only. */
inline fun Container.combobox(
    init: Combobox.() -> Unit = {}
): Combobox {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(Combobox().apply(init))
}

/** Wrapper class for [uiCombobox] - a drop down combo box that allow list selection only. */
class Combobox : Control<uiCombobox>(uiNewCombobox()) {

    /** Adds the named entry to the end of the combobox.
     *  If it is the first entry, it is automatically selected. */
    fun item(text: String) = uiComboboxAppend(ptr, text)

    /** Return or set the current selected option by index. */
    var value: Int
        get() = uiComboboxSelected(ptr)
        set(value) = uiComboboxSetSelected(ptr, value)

    /** Function to be run when the user makes a change to the Combobox.
     *  Only one function can be registered at a time. */
    fun action(block: Combobox.() -> Unit) {
        action = block
        uiComboboxOnSelected(ptr, staticCFunction { _, ref ->
            with(ref.to<Combobox>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (Combobox.() -> Unit)? = null
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a drop down combo box that allow selection from list or free text entry. */
inline fun Container.editablecombobox(
    init: EditableCombobox.() -> Unit = {}
): EditableCombobox {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(EditableCombobox().apply(init))
}

/** Wrapper class for [uiEditableCombobox] -
 *  a drop down combo box that allow selection from list or free text entry. */
class EditableCombobox : Control<uiEditableCombobox>(uiNewEditableCombobox()) {

    /** Adds the named entry to the end of the editable combobox.
     *  If it is the first entry, it is automatically selected. */
    fun item(text: String) = uiEditableComboboxAppend(ptr, text)

    /** Return or set the current selected text or the text value of the selected item in the list. */
    var value: String
        get() = uiEditableComboboxText(ptr).uiText()
        set(value) = uiEditableComboboxSetText(ptr, value)

    /** Function to be run when the user makes a change to the EditableCombobox.
     *  Only one function can be registered at a time. */
    fun action(block: EditableCombobox.() -> Unit) {
        action = block
        uiEditableComboboxOnChanged(ptr, staticCFunction { _, ref ->
            with(ref.to<EditableCombobox>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (EditableCombobox.() -> Unit)? = null
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for an entry widget for numerical values. */
inline fun Container.spinbox(
    min: Int,
    max: Int,
    init: Spinbox.() -> Unit = {}
): Spinbox {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(Spinbox(min, max).apply(init))
}

/** Wrapper class for [uiSpinbox] - an entry widget for numerical values. */
class Spinbox(min: Int, max: Int) : Control<uiSpinbox>(uiNewSpinbox(min, max)) {

    /** The current numeric value of the spinbox. */
    var value: Int
        get() = uiSpinboxValue(ptr)
        set(value) = uiSpinboxSetValue(ptr, value)

    /** Function to be run when the user makes a change to the Spinbox.
     *  Only one function can be registered at a time. */
    fun action(block: Spinbox.() -> Unit) {
        action = block
        uiSpinboxOnChanged(ptr, staticCFunction { _, ref ->
            with(ref.to<Spinbox>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (Spinbox.() -> Unit)? = null
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for an horizontal slide to set numerical values. */
inline fun Container.slider(
    min: Int,
    max: Int,
    init: Slider.() -> Unit = {}
): Slider {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(Slider(min, max).apply(init))
}

/** Wrapper class for [uiSlider] - an horizontal slide to set numerical values. */
class Slider(min: Int, max: Int) : Control<uiSlider>(uiNewSlider(min, max)) {

    /** The current numeric value of the slider. */
    var value: Int
        get() = uiSliderValue(ptr)
        set(value) = uiSliderSetValue(ptr, value)

    /** Function to be run when the user makes a change to the Slider.
     *  Only one function can be registered at a time. */
    fun action(block: Slider.() -> Unit) {
        action = block
        uiSliderOnChanged(ptr, staticCFunction { _, ref ->
            with(ref.to<Slider>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (Slider.() -> Unit)? = null
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a widget that represent a group of radio options. */
inline fun Container.radiobuttons(
    init: RadioButtons.() -> Unit = {}
): RadioButtons {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(RadioButtons().apply(init))
}

/** Wrapper class for [uiRadioButtons] - a widget that represent a group of radio options. */
class RadioButtons : Control<uiRadioButtons>(uiNewRadioButtons()) {

    /** Adds the named button to the end of the radiobuttons.
     *  If it is the first button, it is automatically selected. */
    fun item(text: String) = uiRadioButtonsAppend(ptr, text)

    /** Return or set the current selected option by index. */
    var value: Int
        get() = uiRadioButtonsSelected(ptr)
        set(value) = uiRadioButtonsSetSelected(ptr, value)

    /** Function to be run when the user makes a change to the RadioButtons.
     *  Only one function can be registered at a time. */
    fun action(block: RadioButtons.() -> Unit) {
        action = block
        uiRadioButtonsOnSelected(ptr, staticCFunction { _, ref ->
            with(ref.to<RadioButtons>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (RadioButtons.() -> Unit)? = null
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a widget to edit date and time. */
inline fun Container.datetimepicker(
    init: DateTimePicker.() -> Unit = {}
): DateTimePicker {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(DateTimePicker().apply(init))
}

/** DSL builder for a widget to edit date. */
inline fun Container.datepicker(
    init: DatePicker.() -> Unit = {}
): DatePicker {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(DatePicker().apply(init))
}

/** DSL builder for a widget to edit time. */
inline fun Container.timepicker(
    init: TimePicker.() -> Unit = {}
): TimePicker {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(TimePicker().apply(init))
}

/** Wrapper class for [uiDateTimePicker] - a widget to edit date and time. */
open class DateTimePicker internal constructor(
    alloc: CPointer<uiDateTimePicker>?
) : Control<uiDateTimePicker>(alloc) {
    constructor() : this(uiNewDateTimePicker())

    internal var action: (DateTimePicker.() -> Unit)? = null
    internal open var defaultFormat = "%c"

    /** The current value as posix `struct tm` */
    fun getValue(value: CPointer<tm>) = uiDateTimePickerTime(ptr, value)

    /** Set current value from posix `struct tm` */
    fun setValue(value: CPointer<tm>) = uiDateTimePickerSetTime(ptr, value)

    /** The current value in Unix epoch */
    var value: time_t
        get() = memScoped {
            val tm = alloc<tm>()
            getValue(tm.ptr)
            mktime(tm.ptr)
        }
        set(value) = memScoped {
            val time = alloc<time_tVar>()
            time.value = value
            setValue(localtime(time.ptr)!!)
        }

    /** The current value as String. */
    fun textValue(format: String = defaultFormat): String = memScoped {
        val tm = alloc<tm>()
        val buf = allocArray<ByteVar>(64)
        uiDateTimePickerTime(ptr, tm.ptr)
        strftime(buf, 64, format, tm.ptr)
        return buf.toKString()
    }

    /** Function to be run when the user makes a change to the Picker.
     *  Only one function can be registered at a time. */
    fun action(block: DateTimePicker.() -> Unit) {
        action = block
        uiDateTimePickerOnChanged(ptr, staticCFunction { _, ref ->
            with(ref.to<DateTimePicker>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }
}

/** Wrapper class for [uiDateTimePicker] - a widget to edit date. */
class DatePicker : DateTimePicker(uiNewDatePicker()) {
    override var defaultFormat = "%x"
}

/** Wrapper class for [uiDateTimePicker] - a widget to edit time. */
class TimePicker : DateTimePicker(uiNewTimePicker()) {
    override var defaultFormat = "%X"
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a static text label. */
inline fun Container.label(
    text: String,
    init: Label.() -> Unit = {}
): Label {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(Label(text).apply(init))
}

/** Wrapper class for [uiLabel] - a static text label. */
class Label(text: String) : Control<uiLabel>(uiNewLabel(text)) {

    /** The static text of the label. */
    var text: String
        get() = uiLabelText(ptr).uiText()
        set(value) = uiLabelSetText(ptr, value)
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for an horizontal line to visually separate widgets. */
inline fun VBox.separator(
    init: HorizontalSeparator.() -> Unit = {}
): HorizontalSeparator {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(HorizontalSeparator().apply(init))
}

/** DSL builder for a vertical line to visually separate widgets. */
inline fun HBox.separator(
    init: VerticalSeparator.() -> Unit = {}
): VerticalSeparator {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(VerticalSeparator().apply(init))
}

/** Wrapper class for [uiSeparator] */
abstract class Separator(
    alloc: CPointer<uiSeparator>?
) : Control<uiSeparator>(alloc)

/** Wrapper class for [uiSeparator] - an horizontal line to visually separate widgets. */
class HorizontalSeparator : Separator(uiNewHorizontalSeparator())

/** Wrapper class for [uiSeparator] - a vertical line to visually separate widgets. */
class VerticalSeparator : Separator(uiNewVerticalSeparator())

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a progress bar widget. */
inline fun Container.progressbar(
    init: ProgressBar.() -> Unit = {}
): ProgressBar {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(ProgressBar().apply(init))
}

/** Wrapper class for [uiProgressBar] - a progress bar widget. */
class ProgressBar : Control<uiProgressBar>(uiNewProgressBar()) {

    /** The current position of the progress bar.
     *  Could be set to -1 to create an indeterminate progress bar. */
    var value: Int
        get() = uiProgressBarValue(ptr)
        set(value) = uiProgressBarSetValue(ptr, value)
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a simple button. */
inline fun Container.button(
    text: String,
    init: Button.() -> Unit = {}
): Button {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(Button(text).apply(init))
}

/** Wrapper class for [uiButton] - a simple button. */
class Button(text: String) : Control<uiButton>(uiNewButton(text)) {

    /** The static text of the button. */
    var text: String
        get() = uiButtonText(ptr).uiText()
        set(text) = uiButtonSetText(ptr, text)

    /** Function to be run when the user clicks the Button.
     *  Only one function can be registered at a time. */
    fun action(block: Button.() -> Unit) {
        action = block
        uiButtonOnClicked(ptr, staticCFunction { _, ref ->
            with(ref.to<Button>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (Button.() -> Unit)? = null
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a button that opens a color palette popup. */
inline fun Container.colorbutton(
    init: ColorButton.() -> Unit = {}
): ColorButton {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(ColorButton().apply(init))
}

/** Wrapper class for [uiColorButton] - a button that opens a color palette popup. */
class ColorButton : Control<uiColorButton>(uiNewColorButton()) {

    /** Return or set the currently selected color */
    var value: Color
        get() = memScoped {
            val r = alloc<DoubleVar>()
            val g = alloc<DoubleVar>()
            val b = alloc<DoubleVar>()
            val a = alloc<DoubleVar>()
            uiColorButtonColor(ptr, r.ptr, g.ptr, b.ptr, a.ptr)
            Color(r.value, g.value, b.value, a.value)
        }
        set(value) {
            uiColorButtonSetColor(ptr, value.r, value.g, value.b, value.a)
        }

    /** Function to be run when the user makes a change to the ColorButton.
     *  Only one function can be registered at a time. */
    fun action(block: ColorButton.() -> Unit) {
        action = block
        uiColorButtonOnChanged(ptr, staticCFunction { _, ref ->
            with(ref.to<ColorButton>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (ColorButton.() -> Unit)? = null
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a button that allows users to choose a font when they click on it. */
inline fun Container.fontbutton(
    init: FontButton.() -> Unit = {}
): FontButton {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(FontButton().apply(init))
}

/** Wrapper class for [uiFontButton] - a button that allows users to choose a font. */
class FontButton : Control<uiFontButton>(uiNewFontButton()) {
    private val font = object : Font() {
        override fun clear() {
            if (ptr.pointed.Family != null) uiFreeFontButtonFont(ptr)
        }
    }

    override fun free() {
        font.dispose()
        super.free()
    }

    /** Returns the font currently selected in the FontButton. */
    val value: Font
        get() {
            font.clear()
            uiFontButtonFont(ptr, font.ptr)
            return font
        }
    //TODO: set

    /** Function to be run when the font in the FontButton is changed.
     *  Only one function can be registered at a time. */
    fun action(block: FontButton.() -> Unit) {
        action = block
        uiFontButtonOnChanged(ptr, staticCFunction { _, ref ->
            with(ref.to<FontButton>()) {
                action?.invoke(this)
            }
        }, ref.asCPointer())
    }

    internal var action: (FontButton.() -> Unit)? = null
}
