[libui.ktx](../../README.md) / [Table](../README.md) / [TableColumn](README.md)

# TableColumn

`inner class TableColumn<T>`

### Constructors

| Name | Summary |
|---|---|
| [TableColumn](-table-column.md) | `fun TableColumn()` |

### Functions

| Name | Summary |
|---|---|
| [button](button.md) | `fun button(text: (row: Int) -> String, action: (row: Int) -> Unit)`<br>`fun button(text: String, action: (row: Int) -> Unit)` |
| [checkbox](checkbox.md) | `fun checkbox(property: KMutableProperty1<T, Boolean>)` |
| [color](color.md) | `fun color(get: (row: Int) -> `[`Color`](../../../libui.ktx.draw/-color/README.md)`?)` |
| [image](image.md) | `fun image(get: (row: Int) -> `[`Image`](../../../libui.ktx.draw/-image/README.md)`?)` |
| [label](label.md) | `fun label(get: (row: Int) -> String)`<br>`fun label(property: KProperty1<T, String>)` |
| [progressbar](progressbar.md) | `fun progressbar(get: (row: Int) -> Int)` |
| [textfield](textfield.md) | `fun textfield(property: KMutableProperty1<T, String>)` |
