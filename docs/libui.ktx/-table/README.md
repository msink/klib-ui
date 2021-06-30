[libui.ktx](../README.md) / [Table](README.md)

# Table

`class Table<T>(data: List<T>, handler: CPointer<`[`ktTableHandler`](../../libui/kt-table-handler/README.md)`>) : `[`Disposable`](../-disposable/README.md)`<`[`uiTableModel`](../../libui/ui-table-model.md)`> `

Wrapper class for [uiTableModel](../../libui/ui-table-model.md)

### Constructors

| Name | Summary |
|---|---|
| [Table](-table.md) | `fun <T> Table(data: List<T>, handler: CPointer<`[`ktTableHandler`](../../libui/kt-table-handler/README.md)`> = nativeHeap.alloc<ktTableHandler>().ptr)` |

### Types

| Name | Summary |
|---|---|
| [TableColumn](-table-column/README.md) | `inner class `[`TableColumn`](-table-column/README.md) |

### Properties

| Name | Summary |
|---|---|
| [data](data.md) | `val data: List<T>` |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |

### Functions

| Name | Summary |
|---|---|
| [background](background.md) | `fun background(get: (row: Int) -> `[`Color`](../../libui.ktx.draw/-color/README.md)`?)` |
| [column](column.md) | `fun column(name: String, init: `[`Table.TableColumn`](-table-column/README.md)`<T>.() -> Unit)` |
| [rowChanged](row-changed.md) | `fun rowChanged(index: Int)` |
| [rowDeleted](row-deleted.md) | `fun rowDeleted(oldIndex: Int)` |
| [rowInserted](row-inserted.md) | `fun rowInserted(newIndex: Int)` |

### Inherited functions

| Name | Summary |
|---|---|
| [dispose](../-disposable/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated native resources. |

### Extension functions

| Name | Summary |
|---|---|
| [image](../../libui.ktx.draw/image.md) | `fun Table<*>.image(width: Int, height: Int, block: `[`Image`](../../libui.ktx.draw/-image/README.md)`.() -> Unit = {}): `[`Image`](../../libui.ktx.draw/-image/README.md) |
