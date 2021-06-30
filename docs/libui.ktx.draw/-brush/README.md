[libui.ktx.draw](../README.md) / [Brush](README.md)

# Brush

`class Brush : `[`Disposable`](../../libui.ktx/-disposable/README.md)`<`[`uiDrawBrush`](../../libui/ui-draw-brush/README.md)`> `

Defines the color(s) to draw a path with.

### Constructors

| Name | Summary |
|---|---|
| [Brush](-brush.md) | `fun Brush()` |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Functions

| Name | Summary |
|---|---|
| [linear](linear.md) | `fun linear(start: `[`Point`](../-point/README.md)`, end: `[`Point`](../-point/README.md)`, vararg stops: Pair<Double, `[`Color`](../-color/README.md)`>): Brush`<br>Helper to quickly create linear brush |
| [radial](radial.md) | `fun radial(start: `[`Point`](../-point/README.md)`, center: `[`Point`](../-point/README.md)`, radius: Double, vararg stops: Pair<Double, `[`Color`](../-color/README.md)`>): Brush`<br>Helper to quickly create radial brush |
| [solid](solid.md) | `fun solid(rgb: Int, alpha: Double = 1.0): Brush`<br>`fun solid(color: `[`Color`](../-color/README.md)`, opacity: Double = 1.0): Brush`<br>Helper to quickly set a brush color |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
