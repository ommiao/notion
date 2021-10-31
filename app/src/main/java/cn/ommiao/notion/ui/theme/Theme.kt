package cn.ommiao.notion.ui.theme

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.TweenSpec
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

private val LightColorPalette = NotionColors(
    background = Color.White,
    textPrimary = Color.Black.copy(alpha = 0.87f),
    textSecondary = Color.Black.copy(alpha = 0.60f),
    iconCardBackground = Color(0xFFF1F1F1),
    iconCardSelectedDot = Color(0xFF121212)
)

private val DarkColorPalette = NotionColors(
    background = Color(0xFF121212),
    textPrimary = Color.White.copy(alpha = 0.87f),
    textSecondary = Color.White.copy(alpha = 0.60f),
    iconCardBackground = Color(0xFFF1F1F1),
    iconCardSelectedDot = Color(0xFF121212)
)

class NotionColors(
    background: Color,
    textPrimary: Color,
    textSecondary: Color,
    iconCardBackground: Color,
    iconCardSelectedDot: Color,
) {
    var background: Color by mutableStateOf(background)
        private set
    var textPrimary: Color by mutableStateOf(textPrimary)
        private set
    var textSecondary: Color by mutableStateOf(textSecondary)
        private set
    var iconCardBackground: Color by mutableStateOf(iconCardBackground)
        private set
    var iconCardSelectedDot: Color by mutableStateOf(iconCardSelectedDot)
        private set
}

private val LocalNotionColors = compositionLocalOf {
    LightColorPalette
}

private val LocalNotionTheme = compositionLocalOf {
    NotionTheme.Theme.Light
}

object NotionTheme {
    val colors: NotionColors
        @Composable
        get() = LocalNotionColors.current

    val theme: NotionTheme.Theme
        @Composable
        get() = LocalNotionTheme.current

    enum class Theme {
        Light, Dark
    }
}

@Composable
fun NotionTheme(
    theme: NotionTheme.Theme = NotionTheme.Theme.Light,
    content: @Composable() () -> Unit
) {
    val targetColors = when (theme) {
        NotionTheme.Theme.Light -> LightColorPalette
        NotionTheme.Theme.Dark -> DarkColorPalette
    }
    val background = animateColor(targetColors.background)
    val textPrimary = animateColor(targetColors.textPrimary)
    val textSecondary = animateColor(targetColors.textSecondary)
    val iconCardBackground = animateColor(targetColors.iconCardBackground)
    val iconCardSelectedDot = animateColor(targetColors.iconCardSelectedDot)
    val colors = NotionColors(
        background = background.value,
        textPrimary = textPrimary.value,
        textSecondary = textSecondary.value,
        iconCardBackground = iconCardBackground.value,
        iconCardSelectedDot = iconCardSelectedDot.value
    )
    CompositionLocalProvider(
        LocalNotionTheme provides theme,
        LocalNotionColors provides colors
    ) {
        MaterialTheme(
            shapes = Shapes,
            typography = Typography
        ) {
            content()
        }
    }
}

@Composable
fun animateColor(targetValue: Color) = animateColorAsState(
    targetValue = targetValue,
    animationSpec = TweenSpec(800)
)