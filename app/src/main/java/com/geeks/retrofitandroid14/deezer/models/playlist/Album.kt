package com.geeks.retrofitandroid14.deezer.models.playlist

import com.google.gson.annotations.SerializedName

data class Album(
    @SerializedName("cover")
    val cover: String = "",
    @SerializedName("md5_image")
    val mdImage: String = "",
    @SerializedName("tracklist")
    val tracklist: String = "",
    @SerializedName("cover_xl")
    val coverXl: String = "",
    @SerializedName("cover_medium")
    val coverMedium: String = "",
    @SerializedName("cover_small")
    val coverSmall: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("title")
    val title: String = "",
    @SerializedName("type")
    val type: String = "",
    @SerializedName("cover_big")
    val coverBig: String = ""
)