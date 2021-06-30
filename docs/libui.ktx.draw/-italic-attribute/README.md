[libui.ktx.draw](../README.md) / [ItalicAttribute](README.md)

# ItalicAttribute

`class ItalicAttribute : `[`Attribute`](../-attribute/README.md)

Changes the italic mode of the text it is applied to.

### Constructors

| Name | Summary |
|---|---|
| [ItalicAttribute](-italic-attribute.md) | `fun ItalicAttribute(italic: `[`uiTextItalic`](../../libui/ui-text-italic.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `val value: `[`uiTextItalic`](../../libui/ui-text-italic.md)<br>uiAttributeItalic() returns the font italic mode stored. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [type](../-attribute/type.md) | `val type: `[`uiAttributeType`](../../libui/ui-attribute-type.md)<br>Returns the type of Attribute. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
