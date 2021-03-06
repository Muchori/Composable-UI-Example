@file:Suppress("PackageNaming", "UnusedPrivateMember", "NewLineAtEndOfFile")
package com.joseph.muchori.composable_example.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun Composable_ExampleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = lightColorPalette

    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
