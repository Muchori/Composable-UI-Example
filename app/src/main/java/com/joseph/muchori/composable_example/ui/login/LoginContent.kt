@file:Suppress("PackageNaming")
package com.joseph.muchori.composable_example.ui.login

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joseph.muchori.composable_example.ui.theme.Composable_ExampleTheme


/**
 * This composable maintains the entire screen for handling user login
 *
 * @param[viewState] The current state of the screen to render
 */

@Composable
fun LoginContent(
    viewState: LoginViewState,
) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.primary,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
//            SecondaryButton()
        }
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

private fun EmptyLoginContentPreview(){

    val viewState = LoginViewState(
        email = "",
        password = ""
    )
    Composable_ExampleTheme {
        LoginContent(viewState )
    }
}