package com.example

import kotlinx.serialization.Serializable

@Serializable
data class MediaStorage(
    val id: Int,
    val url: String,
    val text: String,
    val mediaType: String
)
