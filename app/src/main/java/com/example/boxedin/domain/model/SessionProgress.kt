package com.example.boxedin.domain.model

data class SessionProgress(
    val elapsedMinutes: Int,
    val completedBoxes: Int,
    val remainingMinutes: Int
)