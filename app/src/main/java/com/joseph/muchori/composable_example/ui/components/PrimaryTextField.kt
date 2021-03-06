@file:Suppress("PackageNaming")
package com.joseph.muchori.composable_example.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.joseph.muchori.composable_example.R
import com.joseph.muchori.composable_example.ui.theme.Composable_ExampleTheme
import com.joseph.muchori.composable_example.ui.theme.TextFieldShape

/**
 * This is a custom implementation of an [OutlinedTextField] to ensure that it has CE branding and
 * styling that we expect.
 *
 * @param [text] The current text inside the input.
 * @param [onTextChanged] A callback invoked whenever the user modifies the text inside the input.
 * @param [labelText] The label that shows above the input when focused.
 * @param [modifier] An optional [Modifier] to configure this component.
 */

@Composable
fun PrimaryTextField(
    text: String,
    onTextChanged: (String) -> Unit,
    labelText: String,
    modifier: Modifier = Modifier,
    textColor: Color = MaterialTheme.colors.primary,
) {
    OutlinedTextField(
        value = text,
        onValueChange = onTextChanged,
        label = {
            Text(
                text = labelText,
                color = textColor,
            )
        },
        shape = TextFieldShape,
        modifier = modifier
            .heightIn(dimensionResource(id = R.dimen.text_field_height))
            .fillMaxWidth(),
    )
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
private fun EmptyPrimaryTextFieldPreview() {
    Composable_ExampleTheme() {
        Surface {
            PrimaryTextField(
                text = "",
                onTextChanged = {},
                labelText = "Label",
            )
        }
    }
}

@Preview(
    name = "Night Mode -Filled",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Day Mode -Filled",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Composable
@Suppress("UnusedPrivateMember")
private fun FilledPrimaryTextFieldPreview() {
    Composable_ExampleTheme() {
        Surface {
            PrimaryTextField(
                text = "Composable text field",
                onTextChanged = {},
                labelText = "Label",
            )
        }
    }
}
