package com.geeks.retrofitandroid14.deezer.models.playlist

import com.google.gson.annotations.SerializedName

data class Tracks(
    @SerializedName("data")
    val data: List<Track>,
    @SerializedName("checksum")
    val checksum: String = ""
)