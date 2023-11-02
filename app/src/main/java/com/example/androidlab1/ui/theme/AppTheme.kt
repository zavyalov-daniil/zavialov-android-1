package com.example.androidlab1.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp

object AppTheme {
    object BgColors {
        val primary = Color(0xff050b18)
        val divider = Color(0xFF1A1F29)
        val border = Color(0xFF1F2430)
    }

    object ButtonColors {
        val primary = Color(0x38F4D144)
    }

    object TextColors {
        val white = Color(0xFFEEF2FB)
        val gray = Color(0xb2eef2fb)
        val comment = Color(0xFFA8ADB7)
        val date = Color(0x66FFFFFF)
    }

    object TextStyle {
        val Bold_48
            @Composable
            get() =
                TextStyle(
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    fontSize = 48.sp,
                    platformStyle = PlatformTextStyle(includeFontPadding = false),
                    lineHeightStyle = LineHeightStyle(
                        LineHeightStyle.Alignment.Proportional,
                        LineHeightStyle.Trim.None
                    )
                )
    }
}
