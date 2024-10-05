import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import cn.yurn.view.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    CanvasBasedWindow("Yurn") {
        App()
    }
}
