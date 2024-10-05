package cn.yurn.view.componments

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Title(modifier: Modifier = Modifier) {
    Text(
        text = "莉樱(Yurn)",
        style = MaterialTheme.typography.displayLarge,
        modifier = modifier
    )
}

@Composable
fun Description(modifier: Modifier = Modifier) {
    Text(
        text = "Kotlin 开源开发者, 热爱 Kotlin/Compose 跨平台开发",
        style = MaterialTheme.typography.titleLarge,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}