package com.example.androidlab1.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainButton(text: String,
               modifier: Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.height(70.dp)
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                Color(0xfff4d144)
            ),
            modifier = Modifier
                .height(64.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(
                text = text,
                color = Color.Black
            )
        }
        Box(
            modifier = Modifier
                .offset(0.dp, 20.dp)
                .blur(radius = 40.dp)
                .size(311.dp, 50.dp)
                .background(
                    color = Color(0x38F4D144),
                    shape = RoundedCornerShape(size = 10.dp)
                )
        )
    }
}

@Composable
@Preview
fun DotaScreenPreview() {
    MainButton("Install", Modifier.fillMaxWidth())
}
