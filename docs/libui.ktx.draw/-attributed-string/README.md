[libui.ktx.draw](../README.md) / [AttributedString](README.md)

# AttributedString

`class AttributedString(init: String) : `[`Disposable`](../../libui.ktx/-disposable/README.md)`<`[`uiAttributedString`](../../libui/ui-attributed-string.md)`> `

Represents a string of UTF-8 text that can be embellished with formatting attributes.

### Constructors

| | |
|---|---|
| [AttributedString](-attributed-string.md) | `fun AttributedString(init: String)` |

### Properties

| Name | Summary |
|---|---|
| [length](length.md) | `val length: Int`<br>Returns the number of UTF-8 bytes in the textual content, excluding the terminating '\\0'. |
| [string](string.md) | `val string: String`<br>Returns the textual content of AttributedString. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../../libui.ktx/-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../../libui.ktx/-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Functions

| Name | Summary |
|---|---|
| [append](append.md) | `fun append(str: String)`<br>Adds the '\\0'-terminated UTF-8 string `str` to the end. |
| [delete](delete.md) | `fun delete(start: Int, end: Int)`<br>Deletes the characters and attributes in the byte range \[`start`, `end`). |
| [insert](insert.md) | `fun insert(str: String, at: Int)`<br>Adds the '\\0'-terminated UTF-8 string `str` at the byte position specified by `at`. |
| [setAttribute](set-attribute.md) | `fun setAttribute(a: `[`Attribute`](../-attribute/README.md)`, start: Int, end: Int)`<br>Sets a in the byte range \[`start`, `end`). |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../../libui.ktx/-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |
