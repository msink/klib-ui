[libui.ktx.draw](../README.md) / [AttributedString](README.md) / [setAttribute](set-attribute.md)

# setAttribute

`fun setAttribute(a: `[`Attribute`](../-attribute/README.md)`, start: Int, end: Int)`

Sets a in the byte range \[`start`, `end`). Any existing attributes in that byte range of the same type are removed. Takes ownership of `a` you should not use it after `setAttribute()` returns.
