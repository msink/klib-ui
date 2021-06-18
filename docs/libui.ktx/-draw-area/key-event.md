[libui.ktx](../README.md) / [DrawArea](README.md) / [keyEvent](key-event.md)

# keyEvent

`fun keyEvent(block: `[`DrawArea`](README.md)`.(event: `[`uiAreaKeyEvent`](../../libui/ui-area-key-event/README.md)`) -> Boolean)`

Funcion to be run when a key was pressed. Return `true` to indicate that the key event was handled. (a menu item with that accelerator won't activate, no error sound on macOS). Event is an [uiAreaKeyEvent](../../libui/ui-area-key-event/README.md) Only one function can be registered at a time.
