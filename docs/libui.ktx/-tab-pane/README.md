[libui.ktx](../README.md) / [TabPane](README.md)

# TabPane

`class TabPane : `[`Control`](../-control/README.md)`<`[`uiTab`](../../libui/ui-tab.md)`> `

Wrapper class for [uiTab](../../libui/ui-tab.md) - a container that show each children in a separate tab.

### Constructors

| Name | Summary |
|---|---|
| [TabPane](-tab-pane.md) | `fun TabPane()` |

### Types

| Name | Summary |
|---|---|
| [Page](-page/README.md) | `inner class Page(label: String) : `[`Container`](../-container/README.md)<br>adapter for DSL builders |

### Properties

| Name | Summary |
|---|---|
| [numPages](num-pages.md) | `val numPages: Int`<br>Number of pages in the TabPane. |

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
| [add](add.md) | `fun add(label: String, widget: `[`Control`](../-control/README.md)`<*>)`<br>Adds the given page to the end of the TabPane. |
| [delete](delete.md) | `fun delete(page: Int)`<br>Delete deletes the nth page of the TabPane. |
| [getMargined](get-margined.md) | `fun getMargined(page: Int): Boolean`<br>Whether page n (starting at 0) of the Tab has margins around its child. |
| [insert](insert.md) | `fun insert(page: Int, name: String, widget: `[`Control`](../-control/README.md)`<*>)`<br>Adds the given page to the TabPane such that it is the nth page of the TabPane (starting at 0). |
| [setMargined](set-margined.md) | `fun setMargined(page: Int, margined: Boolean)` |

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

### Extension functions

| Name | Summary |
|---|---|
| [page](../page.md) | `inline fun TabPane.page(label: String, margined: Boolean = true, init: `[`TabPane.Page`](-page/README.md)`.() -> Unit = {}): `[`TabPane.Page`](-page/README.md) |
