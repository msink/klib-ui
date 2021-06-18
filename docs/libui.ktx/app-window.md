[libui.ktx](README.md) / [appWindow](app-window.md)

# appWindow

`fun appWindow(title: String, width: Int, height: Int, margined: Boolean = true, init: `[`Window`](-window/README.md)`.() -> Unit = {})`

Initializes package ui, runs `init` to set up the program, and executes the GUI main loop. `init` should set up the program's initial state: open the main window, create controls, and set up events.
