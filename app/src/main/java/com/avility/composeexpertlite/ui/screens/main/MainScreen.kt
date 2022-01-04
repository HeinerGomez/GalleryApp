package com.avility.composeexpertlite.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.annotation.ExperimentalCoilApi

@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun MainScreen() {
    Scaffold(
        topBar = { MainAppBar() }
    ) { padding ->
        MediaList(modifier = Modifier.padding(padding))
    }
}