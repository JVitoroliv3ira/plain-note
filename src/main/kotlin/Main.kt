import androidx.compose.material.Scaffold
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.DarkTheme
import ui.components.Header

fun main() = application {
    Window(title = "Plain Note", onCloseRequest = ::exitApplication) {
        DarkTheme {
            Scaffold(
                topBar = {
                    Header()
                }
            ) {  }
        }
    }
}
