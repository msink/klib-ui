[libui.ktx.draw](../README.md) / [UnderlineAttribute](README.md)

# UnderlineAttribute

`class UnderlineAttribute(u: `[`uiUnderline`](../../libui/ui-underline.md)`) : `[`Attribute`](../-attribute/README.md)

Changes the type of underline on the text it is applied to.

### Constructors

| | |
|---|---|
| [UnderlineAttribute](-underline-attribute.md) | `fun UnderlineAttribute(u: `[`uiUnderline`](../../libui/ui-underline.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [value](value.md) | `val value: `[`uiUnderline`](../../libui/ui-underline.md)<br>Returns the underline type stored in [Attribute](../-attribute/README.md). |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [type](../-attribute/type.md) | `val type: `[`uiAttributeType`](../../libui/ui-attribute-type.md)<br>Returns the type of Attribute. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
