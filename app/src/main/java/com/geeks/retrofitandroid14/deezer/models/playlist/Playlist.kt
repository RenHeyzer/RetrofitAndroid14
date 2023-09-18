package com.geeks.retrofitandroid14.deezer.models.playlist

import com.google.gson.annotations.SerializedName

data class Playlist(
    @SerializedName("md5_image")
    val mdImage: String = "",
    @SerializedName("nb_tracks")
    val nbTracks: Int = 0,
    @SerializedName("picture_xl")
    val pictureXl: String = "",
    @SerializedName("tracklist")
    val tracklist: String = "",
    @SerializedName("creator")
    val creator: Creator,
    @SerializedName("collaborative")
    val collaborative: Boolean = false,
    @SerializedName("link")
    val link: String = "",
    @SerializedName("picture_small")
    val pictureSmall: String = "",
    @SerializedName("description")
    val description: String = "",
    @SerializedName("creation_date")
    val creationDate: String = "",
    @SerializedName("title")
    val title: String = "",
    @SerializedName("type")
    val type: String = "",
    @SerializedName("picture")
    val picture: String = "",
    @SerializedName("tracks")
    val tracks: Tracks,
    @SerializedName("fans")
    val fans: Int = 0,
    @SerializedName("duration")
    val duration: Int = 0,
    @SerializedName("is_loved_track")
    val isLovedTrack: Boolean = false,
    @SerializedName("picture_type")
    val pictureType: String = "",
    @SerializedName("public")
    val public: Boolean = false,
    @SerializedName("picture_big")
    val pictureBig: String = "",
    @SerializedName("checksum")
    val checksum: String = "",
    @SerializedName("share")
    val share: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("picture_medium")
    val pictureMedium: String = ""
)