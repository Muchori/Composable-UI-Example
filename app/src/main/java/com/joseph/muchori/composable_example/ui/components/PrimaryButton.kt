package com.joseph.muchori.composable_example.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joseph.muchori.composable_example.R
import com.joseph.muchori.composable_example.ui.theme.Composable_ExampleTheme

@Composable
fun PrimaryButton (
    text: String,
    onClick: ()->Unit,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.primary
){
    val buttonColors = buttonColors(
        backgroundColor = color,
    )

   Button(
       onClick = onClick,
       colors = buttonColors,
       shape = RoundedCornerShape(50),
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
    name = "Night Mode -Empty",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)

@Preview(
    name = "Day Mode -Empty",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)

@Composable

private fun EmptyLoginContentPreview() {
    Composable_ExampleTheme() {
        PrimaryButton(
            text = "Primary Button",
            onClick = {},
        )
    }
}