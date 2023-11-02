package com.example.androidlab1.ui.gamescreen

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidlab1.Comment
import com.example.androidlab1.R
import com.example.androidlab1.components.CommentBlock
import com.example.androidlab1.components.MainButton
import com.example.androidlab1.components.VideoPreview
import com.example.androidlab1.ui.gamescreen.header.DotaScreenHeader
import com.example.androidlab1.ui.theme.AppTheme

@Composable
fun DotaScreen() {
    val context = LocalContext.current

    val comments = listOf(
        Comment(
            "Auguste Conte",
            "“Once you start to learn its secrets, " +
                    "there’s a wild and exciting variety of play here that’s unmatched, " +
                    "even by its peers.”",
            "February 14, 2023",
            painterResource(R.drawable.auguste_conte)
        ),
        Comment(
            "Jang Marcelino",
            "“Once you start to learn its secrets, there’s a wild and " +
                    "exciting variety of play here that’s unmatched, even by " +
                    "its peers.”",
            "February 14, 2023",
            painterResource(R.drawable.jang_marcelino)
        )
    )
    val previews = listOf(
        painterResource(id = R.drawable.dota_video_1),
        painterResource(id = R.drawable.dota_video_2)
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
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
            VideoPreview(previews)
        }

        item {
            Text(
                text = "Review & Ratings",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(700),
                    letterSpacing = 0.6.sp,
                ),
                color = AppTheme.TextColors.white,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 28.dp,
                    bottom = 16.dp
                )
            )
        }

        itemsIndexed(comments) { index, item ->
            CommentBlock(
                comment = item,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 16.dp,
                    )
            )
            if (index < comments.lastIndex) {
                Divider(
                    color = AppTheme.BgColors.divider,
                    thickness = 1.dp,
                    modifier = Modifier.padding(top = 12.dp, bottom = 10.dp)
                )
            }
        }

        item {
            MainButton(
                text = "Install",
                onClick = {
                    Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show()
                },
                modifier = Modifier
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
    Surface(
        color = AppTheme.BgColors.primary
    ) {
        DotaScreen()
    }
}
