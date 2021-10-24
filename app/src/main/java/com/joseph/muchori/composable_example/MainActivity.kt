package com.joseph.muchori.composable_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.joseph.muchori.composable_example.ui.HomeScreen
import com.joseph.muchori.composable_example.ui.theme.Composable_ExampleTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
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
