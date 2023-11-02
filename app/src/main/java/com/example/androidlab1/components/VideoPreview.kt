package com.example.androidlab1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidlab1.R

@Composable
fun VideoPreview(
    previews: List<Painter>
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .padding(
                start = 24.dp,
                top = 4.dp,
                bottom = 4.dp
            )
            .horizontalScroll(state = ScrollState(0))
    ) {
        for (preview in previews) {
            Image(
                painter = preview,
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(242.dp)
                    .height(138.dp)
                    .clip(RoundedCornerShape(size = 14.dp))
            )
        }
    }
}

@Composable
@Preview
fun VideoPreviewPreview() {
    VideoPreview(
        listOf(
            painterResource(id = R.drawable.dota_video_1),
            painterResource(id = R.drawable.dota_video_2)
        )
    )
}
