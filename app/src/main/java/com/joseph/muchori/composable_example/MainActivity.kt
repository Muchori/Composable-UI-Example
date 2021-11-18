package com.joseph.muchori.composable_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.joseph.muchori.composable_example.ui.HomeScreen
import com.joseph.muchori.composable_example.ui.theme.Composable_ExampleTheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composable_ExampleTheme {
                // A surface container using the 'background' color from the theme
               HomeScreen()
            }
        }
    }
}
