package com.example.androidlab1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
    Box() {
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
        VideoButton(
            modifier = Modifier.offset(120.dp, 43.dp)
        )
    }
}

@Composable
fun VideoButton(
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(CircleShape)
            .border(width = 0.7.dp, color = Color(0x00FFFFFF), shape = CircleShape)
            .padding(0.7.dp)
            .size(48.dp)
            .clip(CircleShape)
            .background(color = Color(0x3DFFFFFF))
    ) {
        Image(
            painter = painterResource(id = R.drawable.start),
            contentDescription = null,
            modifier = Modifier.size(10.dp, 12.dp)
        )
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
