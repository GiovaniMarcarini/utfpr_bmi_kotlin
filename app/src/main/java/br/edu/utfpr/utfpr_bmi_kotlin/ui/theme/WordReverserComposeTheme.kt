package br.edu.utfpr.utfpr_bmi_kotlin.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightThemeColors = lightColorScheme(
    primary = Color(0xFF6200EE),
    secondary = Color(0xFF03DAC6),
)

@Composable
fun WordReverserComposeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightThemeColors,
        content = content
    )
}