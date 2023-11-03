package com.example.androidlab1.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import com.example.androidlab1.ui.theme.AppTheme

@Composable
fun MainButton(text: String,
               onClick: () -> Unit,
               modifier: Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.height(70.dp)
    ) {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(
                AppTheme.ButtonColors.primary
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
                    color = AppTheme.ButtonColors.blur,
                    shape = RoundedCornerShape(size = 10.dp)
                )
        )
    }
}

@Composable
@Preview
fun DotaScreenPreview() {
    MainButton(
        "Install",
        onClick = {
        },
        Modifier.fillMaxWidth()
    )
}
