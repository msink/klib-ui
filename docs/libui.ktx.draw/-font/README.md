[libui.ktx.draw](../README.md) / [Font](README.md)

# Font

`open class Font(family: String?, size: Double, weight: `[`uiTextWeight`](../../libui/ui-text-weight.md)`, italic: `[`uiTextItalic`](../../libui/ui-text-italic.md)`, stretch: `[`uiTextStretch`](../../libui/ui-text-stretch.md)`) : `[`Disposable`](../../libui.ktx/-disposable/README.md)`<`[`uiFontDescriptor`](../../libui/ui-font-descriptor/README.md)`> `

Provides a complete description of a font where one is needed.

### Constructors

| | |
|---|---|
| [Font](-font.md) | `fun Font(family: String? = null, size: Double = 0.0, weight: `[`uiTextWeight`](../../libui/ui-text-weight.md)` = uiTextWeightNormal, italic: `[`uiTextItalic`](../../libui/ui-text-italic.md)` = uiTextItalicNormal, stretch: `[`uiTextStretch`](../../libui/ui-text-stretch.md)` = uiTextStretchNormal)` |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
