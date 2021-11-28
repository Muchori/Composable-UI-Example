@file:Suppress("PackageNaming", "NewLineAtEndOfFile")
package com.joseph.muchori.composable_example.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextButton
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

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textColor: Color = MaterialTheme.colors.primary,
) {

    TextButton(
        onClick = onClick,
        shape = ButtonShape,
        modifier = modifier
            .height(dimensionResource(id = R.dimen.button_height))
            .fillMaxWidth(),

    ) {
        Text(
            text = text.toUpperCase(Locale.current),
            color = textColor,
        )
    }
}

@Preview(
    name = "Night Mode -Empty",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)

@Preview(
    name = "Day Mode -Empty",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)

@Composable
@Suppress("UnusedPrivateMember")
private fun SecondaryButtonPreview() {
    Composable_ExampleTheme() {
        Surface {
            SecondaryButton(
                text = "Secondary Button",
                onClick = {},
            )
        }
    }
}
