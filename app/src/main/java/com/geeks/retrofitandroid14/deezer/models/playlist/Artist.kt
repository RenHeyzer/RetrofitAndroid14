package com.geeks.retrofitandroid14.deezer.models.playlist

import com.google.gson.annotations.SerializedName

data class Artist(
    @SerializedName("tracklist")
    val tracklist: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("link")
    val link: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("type")
    val type: String = ""
)