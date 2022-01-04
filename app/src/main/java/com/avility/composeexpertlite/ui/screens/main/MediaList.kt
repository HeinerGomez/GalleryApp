package com.avility.composeexpertlite.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.avility.composeexpertlite.R
import com.avility.composeexpertlite.model.MediaItem
import com.avility.composeexpertlite.model.getMedia

@ExperimentalFoundationApi
@ExperimentalCoilApi
//@Preview
@Composable
fun MediaList(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_xs)),
        cells = GridCells.Adaptive(dimensionResource(id = R.dimen.cell_min_width)),
        modifier = modifier
    ) {
        items(getMedia()) { item ->
            MediaListItem(item, Modifier.padding(dimensionResource(id = R.dimen.padding_xs)))
        }
    }
}

@ExperimentalCoilApi
@Composable
// @Preview(showBackground = true)
fun MediaListItem(item: MediaItem, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .height(dimensionResource(id = R.dimen.cell_thumb_height))
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = rememberImagePainter(
                    data = item.thumb
                ),
                contentDescription = "Gente",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            if (item.type == MediaItem.Type.VIDEO) {
                Icon(
                    imageVector = Icons.Default.PlayCircleOutline,
                    contentDescription = null,
                    modifier = Modifier.size(dimensionResource(id = R.dimen.cell_play_icon_size)),
                    tint = Color.White
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colors.secondary)
                .padding(dimensionResource(id = R.dimen.padding_medium)),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = item.title,
                style = MaterialTheme.typography.h6,

                )
        }
    }
}

@ExperimentalCoilApi
@ExperimentalFoundationApi
@Preview
@Composable
fun MediaListPreview() {
    MediaList()
}