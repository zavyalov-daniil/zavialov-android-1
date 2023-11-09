package com.example.androidlab1.ui.gamescreen.rating

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidlab1.R

@Composable
fun GameRating(
    score: Double,
    reviewCount: String,
    modifier: Modifier = Modifier
) {
    Row(modifier) {
        Text(
            text = score.toString(),
            style = TextStyle(
                fontSize = 48.sp,
                fontWeight = FontWeight(700),
                color = Color.White
            )
        )
        Reviews(
            reviewCount = reviewCount,
            modifier = Modifier.padding(
                top = 17.dp,
                bottom = 7.dp,
                start = 16.dp
            )
        )
    }
}

@Composable
private fun Reviews(
    reviewCount: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Row {
            for (i in 1..4) {
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(12.dp)
                )
                Spacer(modifier = Modifier.size(4.dp))
            }
            Image(
                painter = painterResource(id = R.drawable.star2),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(12.dp)
            )
        }
        Text(
            text = reviewCount,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFFA8ADB7),
                letterSpacing = 0.5.sp,
            ),
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
@Preview
fun GameRating() {
    GameRating(4.9, "70M Reviews")
}
