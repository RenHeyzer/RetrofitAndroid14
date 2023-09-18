package com.geeks.retrofitandroid14.deezer.models.playlist

import com.google.gson.annotations.SerializedName

data class Track(
    @SerializedName("readable")
    val readable: Boolean = false,
    @SerializedName("preview")
    val preview: String = "",
    @SerializedName("md5_image")
    val mdImage: String = "",
    @SerializedName("artist")
    val artist: Artist,
    @SerializedName("album")
    val album: Album,
    @SerializedName("link")
    val link: String = "",
    @SerializedName("explicit_content_cover")
    val explicitContentCover: Int = 0,
    @SerializedName("title")
    val title: String = "",
    @SerializedName("title_version")
    val titleVersion: String = "",
    @SerializedName("explicit_lyrics")
    val explicitLyrics: Boolean = false,
    @SerializedName("type")
    val type: String = "",
    @SerializedName("title_short")
    val titleShort: String = "",
    @SerializedName("duration")
    val duration: Int = 0,
    @SerializedName("rank")
    val rank: Int = 0,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("explicit_content_lyrics")
    val explicitContentLyrics: Int = 0,
    @SerializedName("time_add")
    val timeAdd: Int = 0
)