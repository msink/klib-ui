[libui.ktx](../README.md) / [TextArea](README.md)

# TextArea

`class TextArea(wrap: Boolean) : `[`Control`](../-control/README.md)`<`[`uiMultilineEntry`](../../libui/ui-multiline-entry.md)`> `

Wrapper class for [uiMultilineEntry](../../libui/ui-multiline-entry.md) - a multiline plain text editing widget

### Constructors

| | |
|---|---|
| [TextArea](-text-area.md) | `fun TextArea(wrap: Boolean = true)` |

### Properties

| Name | Summary |
|---|---|
| [readonly](readonly.md) | `var readonly: Boolean`<br>Whether the text is read-only or not. |
| [value](value.md) | `var value: String`<br>The current text in the area. |

### Inherited properties

| Name | Summary |
|---|---|
| [disposed](../-disposable/disposed.md) | `val disposed: Boolean`<br>Returns `true` if object was disposed - in this case [dispose](../-disposable/dispose.md) will do nothing, all other operations are invalid and will `throw Error("Resource is disposed")`. |
| [enabled](../-control/enabled.md) | `var enabled: Boolean`<br>Whether the Control should be enabled or disabled. |
| [parent](../-control/parent.md) | `var parent: `[`Control`](../-control/README.md)`<*>?`<br>Returns parent of the control or `null` for detached. |
| [toplevel](../-control/toplevel.md) | `val toplevel: Boolean`<br>Returns whether the control is a top level one or not. |
| [visible](../-control/visible.md) | `var visible: Boolean`<br>Whether the Control should be visible or hidden. |

### Functions

| Name | Summary |
|---|---|
| [action](action.md) | `fun action(block: TextArea.() -> Unit)`<br>Function to be run when the user makes a change to the TextArea. |
| [append](append.md) | `fun append(text: String)`<br>Adds the text to the end of the area. |

### Inherited functions

| Name | Summary |
|---|---|
| [disable](../-control/disable.md) | `fun disable()`<br>Disables the Control. |
| [dispose](../-control/dispose.md) | `open fun dispose()`<br>Dispose and free all allocated resources. |
| [enable](../-control/enable.md) | `fun enable()`<br>Enables the Control. |
| [getHandle](../-control/get-handle.md) | `fun getHandle(): ULong`<br>Returns the OS-level handle associated with this Control. |
| [hide](../-control/hide.md) | `fun hide()`<br>Hides the Control. |
| [isEnabled](../-control/is-enabled.md) | `fun isEnabled(): Boolean`<br>Whether the Control is enabled. |
| [isEnabledToUser](../-control/is-enabled-to-user.md) | `fun isEnabledToUser(): Boolean`<br>Whether the Control and all parents are enabled. |
| [isVisible](../-control/is-visible.md) | `fun isVisible(): Boolean`<br>Whether the Control is visible. |
| [show](../-control/show.md) | `fun show()`<br>Shows the Control. |
