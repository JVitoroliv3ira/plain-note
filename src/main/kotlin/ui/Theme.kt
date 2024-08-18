package ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkThemePalette = darkColors(
    primary = Color(0xFF1E88E5),
    primaryVariant = Color(0xFF1565C0),
    secondary = Color(0xFF00ACC1),
    background = Color(0xFF333333),
    surface = Color(0xFF424242),
    error = Color(0xFFD32F2F),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color(0xFFEEEEEE),
    onSurface = Color(0xFFEEEEEE),
)

@Composable
fun DarkTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = DarkThemePalette,
        typography = Typography(),
        shapes = Shapes(),
        content = content
    )
}
