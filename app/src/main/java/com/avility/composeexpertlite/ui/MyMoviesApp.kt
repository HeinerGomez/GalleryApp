package com.avility.composeexpertlite.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.avility.composeexpertlite.ui.theme.ComposeExpertLiteTheme

@Composable
fun MyMoviesApp(content:  @Composable () -> Unit) {
    ComposeExpertLiteTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}