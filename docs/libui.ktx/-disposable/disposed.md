[libui.ktx](../README.md) / [Disposable](README.md) / [disposed](disposed.md)

# disposed

`val disposed: Boolean`

Returns `true` if object was disposed - in this case [dispose](dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`.
