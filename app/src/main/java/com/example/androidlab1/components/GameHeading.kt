package com.example.androidlab1.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidlab1.R
import com.example.androidlab1.ui.theme.AppTheme

@Composable
fun GameHeading(name: String, downloads: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = name,
            fontSize = 20.sp,
            lineHeight = 26.sp,
            fontWeight = FontWeight(700),
            color = Color.White,
            letterSpacing = 0.5.sp,
        )
        Spacer(modifier = Modifier.height(6.dp))
        GameRating(downloads)
    }
}

@Composable
private fun GameRating(downloads: String) {
    Row(
        horizontalArrangement = Arrangement.Center,
    ) {
        for (i in 1..5) {
            if (i != 1) {
                Spacer(modifier = Modifier.size(4.dp))
            }
            Image(
                painter = painterResource(id = R.drawable.star),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(12.dp)
            )
        }
        Spacer(modifier = Modifier.size(10.dp))
        Text(
            text = downloads,
            style = TextStyle(
                fontSize = 9.sp,//TODO: 12.sp,
                fontWeight = FontWeight(400),
                color = AppTheme.TextColors.downloads,
                letterSpacing = 0.5.sp,
            )
        )
    }
}

@Composable
@Preview
fun GameHeading() {
    GameHeading(
        stringResource(id = R.string.dota_2),
        stringResource(id = R.string.downloads)
    )
}