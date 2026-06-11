package com.example.boxedin.presentation.session

data class SessionUiState(
    val sessionName: String,
    val elapsedMinutes: Int,
    val completedBoxes: Int,
    val remainingMinutes: Int
)