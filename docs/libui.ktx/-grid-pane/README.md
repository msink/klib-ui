[libui.ktx](../README.md) / [GridPane](README.md)

# GridPane

`class GridPane : `[`Control`](../-control/README.md)`<`[`uiGrid`](../../libui/ui-grid.md)`> , `[`Container`](../-container/README.md)

Wrapper class for [uiGrid](../../libui/ui-grid.md) - a powerful container that allow to specify size and position of each children.

### Constructors

| | |
|---|---|
| [GridPane](-grid-pane.md) | `fun GridPane()` |

### Properties

| Name | Summary |
|---|---|
| [halign](halign.md) | `var halign: `[`uiAlign`](../../libui/ui-align.md)<br>The horizontal alignment of Control. |
| [hexpand](hexpand.md) | `var hexpand: Boolean = false`<br>The horizontal expand of Control. |
| [padded](padded.md) | `var padded: Boolean`<br>If true, the container insert some space between children. |
| [valign](valign.md) | `var valign: `[`uiAlign`](../../libui/ui-align.md)<br>The vertical alignment of Control. |
| [vexpand](vexpand.md) | `var vexpand: Boolean = false`<br>The vertical expand of Control. |
| [x](x.md) | `var x: Int = 0`<br>The x-coordinate of the Control's location. |
| [xspan](xspan.md) | `var xspan: Int = 1`<br>The width of the Control. |
| [y](y.md) | `var y: Int = 0`<br>The y-coordinate of the Control's location. |
| [yspan](yspan.md) | `var yspan: Int = 1`<br>The height of the Control. |

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
| [add](add.md) | `open fun <T : `[`Control`](../-control/README.md)`<*>> add(widget: T): T`<br>Adds the given widget to the end of the form. |
| [insert](insert.md) | `fun insert(widget: `[`Control`](../-control/README.md)`<*>, existing: `[`Control`](../-control/README.md)`<*>, at: `[`uiAt`](../../libui/ui-at.md)`)`<br>Insert the given Control after existing Control. |
| [row](row.md) | `fun row()` |

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
