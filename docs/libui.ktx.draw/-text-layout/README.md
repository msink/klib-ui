[libui.ktx.draw](../README.md) / [TextLayout](README.md)

# TextLayout

`class TextLayout(string: `[`AttributedString`](../-attributed-string/README.md)`, defaultFont: `[`Font`](../-font/README.md)`, width: Double, align: `[`uiDrawTextAlign`](../../libui/ui-draw-text-align.md)`) : `[`Disposable`](../../libui.ktx/-disposable/README.md)`<`[`uiDrawTextLayout`](../../libui/ui-draw-text-layout.md)`> `

Representation of a [AttributedString](../-attributed-string/README.md) that can be displayed in a [DrawContext](../../libui.ktx/-draw-context.md).

### Constructors

| Name | Summary |
|---|---|
| [TextLayout](-text-layout.md) | `fun TextLayout(string: `[`AttributedString`](../-attributed-string/README.md)`, defaultFont: `[`Font`](../-font/README.md)`, width: Double, align: `[`uiDrawTextAlign`](../../libui/ui-draw-text-align.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [size](size.md) | `val size: `[`Size`](../-size/README.md)<br>Returns the size of TextLayout. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
