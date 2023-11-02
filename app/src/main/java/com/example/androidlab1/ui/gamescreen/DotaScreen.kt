package com.example.androidlab1.ui.gamescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidlab1.components.MainButton
import com.example.androidlab1.components.VideoPreview
import com.example.androidlab1.ui.gamescreen.header.DotaScreenHeader

@Composable
fun DotaScreen(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .background(color = Color(0xff050b18))
    ) {
        item {
            DotaScreenHeader()
        }
        item {
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has " +
                        "two teams of five players compete to collectively destroy a large structure " +
                        "defended by the opposing team known as the \"Ancient\", " +
                        "whilst defending their own.",
                color = Color(0xb2eef2fb),
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 14.dp,
                    bottom = 14.dp
                )
            )
        }
        item {
            VideoPreview()
        }
        item {
            MainButton(
                "Install",
                Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 20.dp,
                        bottom = 40.dp
                    )

            )
        }
    }
}

@Composable
@Preview
fun DotaScreenPreview() {
    DotaScreen()
}
