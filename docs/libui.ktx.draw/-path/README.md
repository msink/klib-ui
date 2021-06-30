[libui.ktx.draw](../README.md) / [Path](README.md)

# Path

`class Path(mode: `[`uiDrawFillMode`](../../libui/ui-draw-fill-mode.md)`) : `[`Disposable`](../../libui.ktx/-disposable/README.md)`<`[`uiDrawPath`](../../libui/ui-draw-path.md)`> `

Represent a path that could be drawed on a [DrawContext](../../libui.ktx/-draw-context.md)

### Constructors

| Name | Summary |
|---|---|
| [Path](-path.md) | `fun Path(mode: `[`uiDrawFillMode`](../../libui/ui-draw-fill-mode.md)`)` |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Functions

| Name | Summary |
|---|---|
| [arcTo](arc-to.md) | `fun arcTo(xCenter: Double, yCenter: Double, radius: Double, startAngle: Double, sweep: Double, negative: Boolean = false)`<br>Adds an arc to the path which is centered at (`xCenter`, `yCenter`) position with radius `radius` starting at `startAngle` and with sweep angle `sweep` going in the given direction by anticlockwise (defaulting to clockwise) as specified by `negative`. |
| [bezierTo](bezier-to.md) | `fun bezierTo(c1x: Double, c1y: Double, c2x: Double, c2y: Double, endX: Double, endY: Double)`<br>Adds a cubic Bézier curve to the path. |
| [closeFigure](close-figure.md) | `fun closeFigure()`<br>Causes the point of the pen to move back to the start of the current sub-path. |
| [figure](figure.md) | `fun figure(x: Double, y: Double)`<br>Starts a new figure at the specified point. |
| [figureWithArc](figure-with-arc.md) | `fun figureWithArc(xCenter: Double, yCenter: Double, radius: Double, startAngle: Double, sweep: Double, negative: Boolean = false)`<br>Starts a new figure and adds an arc to the path which is centered at (`xCenter`, `yCenter`) position with radius `radius` starting at `startAngle` and with sweep angle `sweep` going in the given direction by anticlockwise (defaulting to clockwise) as specified by `negative`. |
| [lineTo](line-to.md) | `fun lineTo(x: Double, y: Double)`<br>Connects the last point in the subpath to the `x`, `y` coordinates with a straight line. |
| [rectangle](rectangle.md) | `fun rectangle(x: Double, y: Double, width: Double, height: Double)`<br>Creates a path for a rectangle at position (`x`, `y`) with a size that is determined by `width` and `height`. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
