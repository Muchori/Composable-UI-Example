@file:Suppress("PackageNaming", "NewLineAtEndOfFile")
package com.joseph.muchori.composable_example.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import com.joseph.muchori.composable_example.R
import com.joseph.muchori.composable_example.ui.theme.ButtonShape
import com.joseph.muchori.composable_example.ui.theme.Composable_ExampleTheme

/**
 * This is a custom [Button] that provides the shape and style expected in the app.
 * @param [text] The text inside the button.
 * @param [onClick] A callback invoked when the user clicks the button.
 * @param [modifier] An optional [Modifier] to configure this component.
 */

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colors.primary,
) {
    val buttonColors = buttonColors(
        backgroundColor = backgroundColor,
    )

    Button(
        onClick = onClick,
        colors = buttonColors,
        shape = ButtonShape,
        modifier = modifier
            .height(dimensionResource(id = R.dimen.button_height))
            .fillMaxWidth(),

    ) {
        Text(
            text = text.toUpperCase(Locale.current),
        )
    }
}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)

@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)

@Composable
@Suppress("UnusedPrivateMember")
private fun PrimaryButtonPreview() {
    Composable_ExampleTheme() {
        Surface {
            PrimaryButton(
                text = "Primary Button",
                onClick = {},
            )
        }
    }
}
