[libui.ktx.draw](../README.md) / [UnderlineColorAttribute](README.md)

# UnderlineColorAttribute

`class UnderlineColorAttribute(kind: `[`uiUnderlineColor`](../../libui/ui-underline-color.md)`, color: `[`Color`](../-color/README.md)`) : `[`Attribute`](../-attribute/README.md)

Changes the color of the underline on the text it is applied to.

### Constructors

| Name | Summary |
|---|---|
| [UnderlineColorAttribute](-underline-color-attribute.md) | `fun UnderlineColorAttribute(kind: `[`uiUnderlineColor`](../../libui/ui-underline-color.md)`, color: `[`Color`](../-color/README.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [color](color.md) | `val color: `[`Color`](../-color/README.md)<br>Returns the underline color stored. |
| [kind](kind.md) | `val kind: `[`uiUnderlineColor`](../../libui/ui-underline-color.md)<br>Returns the underline color kind stored. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [type](../-attribute/type.md) | `val type: `[`uiAttributeType`](../../libui/ui-attribute-type.md)<br>Returns the type of Attribute. |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
