package com.avility.composeexpertlite.ui.screens.main

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.avility.composeexpertlite.R

@Composable
fun MainAppBar() {
    TopAppBar (
        title = {
            Text(text = stringResource(id = R.string.app_name))
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = null
                )
            }
        },
        actions = {
            AppBarAction(imageVector = Icons.Default.Search, onClick = {})
            AppBarAction(imageVector = Icons.Default.Share, onClick = {})
        }
    )
}

@Composable
private fun AppBarAction(
    imageVector: ImageVector,
    onClick: () -> Unit
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = imageVector,
            contentDescription = null
        )
    }
}