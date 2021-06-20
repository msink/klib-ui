[libui.ktx.draw](../README.md) / [Image](README.md)

# Image

`class Image(width: Double, height: Double) : `[`Disposable`](../../libui.ktx/-disposable/README.md)`<`[`uiImage`](../../libui/ui-image.md)`> `

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |

### Extensions

| Name | Summary |
|---|---|
| [bitmap](../bitmap.md) | `fun Image.bitmap(data: `[`ImageData`](../-image-data/README.md)`)` |
