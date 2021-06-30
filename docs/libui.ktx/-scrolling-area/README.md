[libui.ktx](../README.md) / [ScrollingArea](README.md)

# ScrollingArea

`class ScrollingArea : `[`DrawArea`](../-draw-area/README.md)

Wrapper class for [uiArea](../../libui/ui-area.md) - a canvas with horziontal and vertical scrollbars.

### Constructors

| Name | Summary |
|---|---|
| [ScrollingArea](-scrolling-area.md) | `fun ScrollingArea(width: Int, height: Int, handler: CPointer<`[`ktAreaHandler`](../../libui/kt-area-handler/README.md)`> = nativeHeap.alloc<ktAreaHandler>().ptr, alloc: CPointer<`[`uiArea`](../../libui/ui-area.md)`>? = uiNewScrollingArea(handler.pointed.ui.ptr, width, height))` |

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
| [scrollTo](scroll-to.md) | `fun scrollTo(x: Double, y: Double, width: Double, height: Double)`<br>Scrolls the ScrollingArea to show the given rectangle. |
| [setSize](set-size.md) | `fun setSize(width: Int, height: Int)`<br>Sets the size of a ScrollingArea to the given size, in points. |

### Inherited functions

| Name | Summary |
|---|---|
| [disable](../-control/disable.md) | `fun disable()`<br>Disables the Control. |
| [dispose](../-control/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated resources. |
| [dragBroken](../-draw-area/drag-broken.md) | `fun dragBroken(block: `[`DrawArea`](../-draw-area/README.md)`.() -> Unit)`<br>Funcion to be run to indicate that a drag should be ended. |
| [draw](../-draw-area/draw.md) | `fun draw(block: `[`DrawContext`](../-draw-context.md)`.(`[`AreaDrawParams`](../-area-draw-params.md)`) -> Unit)`<br>Funcion to be run when the area was created or got resized with [AreaDrawParams](../-area-draw-params.md) as parameter. |
| [enable](../-control/enable.md) | `fun enable()`<br>Enables the Control. |
| [getHandle](../-control/get-handle.md) | `fun getHandle(): ULong`<br>Returns the OS-level handle associated with this Control. |
| [hide](../-control/hide.md) | `fun hide()`<br>Hides the Control. |
| [isEnabled](../-control/is-enabled.md) | `fun isEnabled(): Boolean`<br>Whether the Control is enabled. |
| [isEnabledToUser](../-control/is-enabled-to-user.md) | `fun isEnabledToUser(): Boolean`<br>Whether the Control and all parents are enabled. |
| [isVisible](../-control/is-visible.md) | `fun isVisible(): Boolean`<br>Whether the Control is visible. |
| [keyEvent](../-draw-area/key-event.md) | `fun keyEvent(block: `[`DrawArea`](../-draw-area/README.md)`.(event: `[`uiAreaKeyEvent`](../../libui/ui-area-key-event/README.md)`) -> Boolean)`<br>Funcion to be run when a key was pressed. |
| [mouseCrossed](../-draw-area/mouse-crossed.md) | `fun mouseCrossed(block: `[`DrawArea`](../-draw-area/README.md)`.(left: Boolean) -> Unit)`<br>Funcion to be run when the mouse entered (`left == false`) or left the area. |
| [mouseEvent](../-draw-area/mouse-event.md) | `fun mouseEvent(block: `[`DrawArea`](../-draw-area/README.md)`.(`[`AreaMouseEvent`](../-area-mouse-event.md)`) -> Unit)`<br>Funcion to be run when the mouse was moved or clicked over the area with [AreaMouseEvent](../-area-mouse-event.md) as parameter. |
| [redraw](../-draw-area/redraw.md) | `fun redraw()`<br>Queues the entire DrawArea for redraw. |
| [show](../-control/show.md) | `fun show()`<br>Shows the Control. |

### Extension functions

| Name | Summary |
|---|---|
| [brush](../../libui.ktx.draw/brush.md) | `fun `[`DrawArea`](../-draw-area/README.md)`.brush(): `[`Brush`](../../libui.ktx.draw/-brush/README.md)<br>Creates a new [Brush](../../libui.ktx.draw/-brush/README.md) with lifecycle delegated to [DrawArea](../-draw-area/README.md). |
| [string](../../libui.ktx.draw/string.md) | `fun `[`DrawArea`](../-draw-area/README.md)`.string(init: String): `[`AttributedString`](../../libui.ktx.draw/-attributed-string/README.md)<br>Creates a new [AttributedString](../../libui.ktx.draw/-attributed-string/README.md) from initial String. The string will be entirely unattributed. |
| [stroke](../../libui.ktx.draw/stroke.md) | `fun `[`DrawArea`](../-draw-area/README.md)`.stroke(block: `[`uiDrawStrokeParams`](../../libui/ui-draw-stroke-params/README.md)`.() -> Unit = {}): `[`Stroke`](../../libui.ktx.draw/-stroke/README.md)<br>Creates a new [Stroke](../../libui.ktx.draw/-stroke/README.md) with lifecycle delegated to [DrawArea](../-draw-area/README.md). |
