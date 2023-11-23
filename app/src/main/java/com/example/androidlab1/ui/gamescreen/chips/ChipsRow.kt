package com.example.androidlab1.ui.gamescreen.chips

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidlab1.components.ChipContent

@Composable
fun ChipsRow(items: List<String>, modifier: Modifier = Modifier) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
    ) {
        items(items) { item ->
            ChipContent(item)
        }
    }
}

@Preview
@Composable
fun ChipsRowPreview() {
    ChipsRow(
        items = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
    )
}
