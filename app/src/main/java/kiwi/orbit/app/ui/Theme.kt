package kiwi.orbit.app.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import kiwi.orbit.OrbitTheme
import kiwi.orbit.app.R
import kiwi.orbit.foundation.Typography
import kiwi.orbit.foundation.darkColors
import kiwi.orbit.foundation.lightColors

val fonts = fontFamily(
    font(R.font.circular_pro_book, FontWeight.Normal),
    font(R.font.circular_pro_medium, FontWeight.Medium),
    font(R.font.circular_pro_bold, FontWeight.Bold),
)

@Composable
fun AppTheme(
    isLightTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    OrbitTheme(
        typography = Typography(defaultFontFamily = fonts),
        colors = if (isLightTheme) lightColors() else darkColors(),
    ) {
        content()
    }
}
