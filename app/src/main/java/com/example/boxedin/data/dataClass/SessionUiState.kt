package com.example.boxedin.data.dataClass

data class SessionUiState(
    val sessionName: String,
    val elapsedMinutes: Int,
    val completedBoxes: Int,
    val remainingMinutes: Int
)