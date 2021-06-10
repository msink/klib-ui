// SPDX-License-Identifier: MIT OR Apache-2.0

package libui.ktx

import cnames.structs.uiBox
import cnames.structs.uiForm
import cnames.structs.uiGrid
import cnames.structs.uiGroup
import cnames.structs.uiTab
import kotlinx.cinterop.CPointer
import libui.*
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

///////////////////////////////////////////////////////////////////////////////
//
// Container widgets:
// - [group]
// - [hbox]
// - [vbox]
// - [form]
// - [tabpane]
// - [gridpane]
//
///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a container for a single widget that provide
 *  a caption and visually group it's children. */
fun Container.group(
    title: String,
    margined: Boolean = true,
    init: Group.() -> Unit = {}
): Group {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(Group(title)
        .apply { if (margined) this.margined = margined }
        .apply(init))
}

/** Wrapper class for [uiGroup] - a container for a single widget that provide
 *  a caption and visually group it's children. */
class Group(title: String) : Control<uiGroup>(uiNewGroup(title)), Container {

    /** Set the child widget of the Group. */
    override fun <T : Control<*>> add(widget: T): T {
        uiGroupSetChild(ptr, widget.ctl)
        return widget
    }

    /** Specify the caption of the group. */
    var title: String
        get() = uiGroupTitle(ptr).uiText()
        set(title) = uiGroupSetTitle(ptr, title)

    /** Specify if the group content area should have a margin or not. */
    var margined: Boolean
        get() = uiGroupMargined(ptr) != 0
        set(margined) = uiGroupSetMargined(ptr, if (margined) 1 else 0)
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a container that stack its children horizontally. */
inline fun Container.hbox(
    padded: Boolean = true,
    init: HBox.() -> Unit = {}
): HBox {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(HBox()
        .apply { if (padded) this.padded = padded }
        .apply(init))
}

/** DSL builder for a container that stack its children vertically. */
inline fun Container.vbox(
    padded: Boolean = true,
    init: VBox.() -> Unit = {}
): VBox {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(VBox()
        .apply { if (padded) this.padded = padded }
        .apply(init))
}

/** DSL builder for a container that stack its children horizontally. */
inline val Container.hbox: HBox get() = hbox()

/** DSL builder for a container that stack its children vertically. */
inline val Container.vbox: VBox get() = vbox()

/** Wrapper class for [uiBox] - a container that stack its children horizontally or vertically. */
abstract class Box(alloc: CPointer<uiBox>?) : Control<uiBox>(alloc), Container {
    /** Next added child should expand to use all available size. */
    var stretchy = false

    /** Adds the given widget to the end of the Box. */
    override fun <T : Control<*>> add(widget: T): T {
        uiBoxAppend(ptr, widget.ctl, if (stretchy) 1 else 0)
        stretchy = false
        return widget
    }

    /** If `true`, the container insert some space between children. */
    var padded: Boolean
        get() = uiBoxPadded(ptr) != 0
        set(padded) = uiBoxSetPadded(ptr, if (padded) 1 else 0)

    /** Deletes the nth control of the Box. */
    fun delete(index: Int) = uiBoxDelete(ptr, index)
}

/** Wrapper class for [uiBox] - a container that stack its children horizontally. */
class HBox : Box(uiNewHorizontalBox())

/** Wrapper class for [uiBox] - a container that stack its children vertically. */
class VBox : Box(uiNewVerticalBox())

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a container that organize children as labeled fields. */
inline fun Container.form(
    padded: Boolean = true,
    init: Form.() -> Unit = {}
): Form {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(Form()
        .apply { if (padded) this.padded = padded }
        .apply(init))
}

/** Wrapper class for [uiForm] - a container that organize children as labeled fields. */
class Form : Control<uiForm>(uiNewForm()), Container {
    /** Label for next added child */
    var label = ""

    /** Next added child should expand to use all available size. */
    var stretchy = false

    /** Adds the given widget to the end of the form. */
    override fun <T : Control<*>> add(widget: T): T {
        uiFormAppend(ptr, label, widget.ctl, if (stretchy) 1 else 0)
        label = ""
        stretchy = false
        return widget
    }

    /** If true, the container insert some space between children. */
    var padded: Boolean
        get() = uiFormPadded(ptr) != 0
        set(padded) = uiFormSetPadded(ptr, if (padded) 1 else 0)

    /** deletes the nth control of the form. */
    fun delete(index: Int) = uiFormDelete(ptr, index)
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a container that show each children in a separate tab. */
inline fun Container.tabpane(
    init: TabPane.() -> Unit = {}
): TabPane {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(TabPane().apply(init))
}

inline fun TabPane.page(
    label: String,
    margined: Boolean = true,
    init: TabPane.Page.() -> Unit = {}
): TabPane.Page {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return Page(label)
        .apply(init)
        .apply { if (margined) this.margined = true }
}

/** Wrapper class for [uiTab] - a container that show each children in a separate tab. */
class TabPane : Control<uiTab>(uiNewTab()) {

    /** adapter for DSL builders */
    inner class Page(val label: String) : Container {
        private val pane: TabPane get() = this@TabPane
        private val page = pane.numPages // last page
        override fun <T : Control<*>> add(widget: T): T {
            pane.add(label, widget)
            return widget
        }
        var margined: Boolean
            get() = pane.getMargined(page)
            set(margined) = pane.setMargined(page, margined)
    }

    /** Whether page n (starting at 0) of the Tab has margins around its child. */
    fun getMargined(page: Int): Boolean = uiTabMargined(ptr, page) != 0
    fun setMargined(page: Int, margined: Boolean) = uiTabSetMargined(ptr, page, if (margined) 1 else 0)

    /** Number of pages in the TabPane. */
    val numPages: Int get() = uiTabNumPages(ptr)

    /** Adds the given page to the end of the TabPane. */
    fun add(label: String, widget: Control<*>) {
        uiTabAppend(ptr, label, widget.ctl)
    }

    /** Adds the given page to the TabPane such that it is the nth page of the TabPane (starting at 0). */
    fun insert(page: Int, name: String, widget: Control<*>) = uiTabInsertAt(ptr, name, page, widget.ctl)

    /** Delete deletes the nth page of the TabPane. */
    fun delete(page: Int) = uiTabDelete(ptr, page)
}

///////////////////////////////////////////////////////////////////////////////

/** DSL builder for a powerful container that allow to specify
 *  size and position of each children. */
inline fun Container.gridpane(
    padded: Boolean = true,
    init: GridPane.() -> Unit = {}
): GridPane {
    contract {
        callsInPlace(init, InvocationKind.EXACTLY_ONCE)
    }
    return add(GridPane()
        .apply { if (padded) this.padded = padded }
        .apply(init))
}

/** Wrapper class for [uiGrid] - a powerful container that allow to specify
 *  size and position of each children. */
class GridPane : Control<uiGrid>(uiNewGrid()), Container {

    /** The x-coordinate of the Control's location. */
    var x = 0

    /** The y-coordinate of the Control's location. */
    var y = 0

    /** The width of the Control. */
    var xspan = 1

    /** The height of the Control. */
    var yspan = 1

    /** The horizontal expand of Control. */
    var hexpand = false

    /** The horizontal alignment of Control. */
    var halign: uiAlign = uiAlignFill

    /** The vertical expand of Control. */
    var vexpand = false

    /** The vertical alignment of Control. */
    var valign: uiAlign = uiAlignFill

    /** If true, the container insert some space between children. */
    var padded: Boolean
        get() = uiGridPadded(ptr) != 0
        set(padded) = uiGridSetPadded(ptr, if (padded) 1 else 0)

    private fun nextCell() {
        x++
        xspan = 1
        yspan = 1
        hexpand = false
        halign = uiAlignFill
        vexpand = false
        valign = uiAlignFill
    }

    fun row() {
        y++
        x = 0
    }

    /** Adds the given widget to the end of the form. */
    override fun <T : Control<*>> add(widget: T): T {
        uiGridAppend(
            ptr, widget.ctl,
            x, y, xspan, yspan,
            if (hexpand) 1 else 0, halign,
            if (vexpand) 1 else 0, valign
        )
        nextCell()
        return widget
    }

    /** Insert the given Control after existing Control.
     *
     *  @param[widget] The Control to be added.
     *  @param[existing] The existing Control at which Control be inserted.
     *  @param[at] The relative placement of the Control to the existing one.
     */
    fun insert(
        widget: Control<*>,
        existing: Control<*>,
        at: uiAt
    ) {
        uiGridInsertAt(
            ptr, widget.ctl, existing.ctl,
            at, xspan, yspan,
            if (hexpand) 1 else 0, halign,
            if (vexpand) 1 else 0, valign
        )
        nextCell()
    }
}
