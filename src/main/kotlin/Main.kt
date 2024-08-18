import androidx.compose.material.Scaffold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import ui.DarkTheme
import ui.components.Header
import ui.components.TextEditor

fun main() = application {
    Window(
        title = "Plain Note",
        state = WindowState(width = 800.dp, height = 600.dp),
        onCloseRequest = ::exitApplication
    ) {
        DarkTheme {
            Scaffold(
                topBar = {
                    Header()
                }
            ) {
                TextEditor()
            }
        }
    }
}
