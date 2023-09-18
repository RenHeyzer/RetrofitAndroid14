package com.geeks.retrofitandroid14.deezer.models.playlist

import com.google.gson.annotations.SerializedName

data class Creator(
    @SerializedName("tracklist")
    val tracklist: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("type")
    val type: String = ""
)