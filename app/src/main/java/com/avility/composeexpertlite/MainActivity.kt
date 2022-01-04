package com.avility.composeexpertlite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import coil.annotation.ExperimentalCoilApi
import com.avility.composeexpertlite.ui.MyMoviesApp
import com.avility.composeexpertlite.ui.screens.main.MainScreen

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    @ExperimentalCoilApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMoviesApp {
                MainScreen()
            }
        }
    }
}