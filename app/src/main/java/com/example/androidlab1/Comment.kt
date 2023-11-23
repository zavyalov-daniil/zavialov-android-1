package com.example.androidlab1

import androidx.compose.ui.graphics.painter.Painter

data class Comment(
    val author: String,
    val text: String,
    val date: String,
    val avatar: Painter
)
