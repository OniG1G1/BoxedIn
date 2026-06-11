package com.example.boxedin.data.model.dataClass

data class SessionUiState(
    val sessionName: String,
    val elapsedMinutes: Int,
    val completedBoxes: Int,
    val remainingMinutes: Int
)