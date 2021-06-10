import libui.ktx.*

fun main() = appWindow(
    title = "Authentication required",
    width = 320,
    height = 200
) {
    vbox {
        val username: TextField
        val password: PasswordField

        form {
            username = textfield { label = "Username" }
            password = passwordfield { label = "Password" }
        }
        button("Login") {
            action {
                MsgBox("${username.value}:${password.value}")
            }
        }
    }
}
