package com.example.boxedin.domain.model

data class Session(
    val name: String,
    val durationMinutes: Int,
    val startTimeMillis: Long
)