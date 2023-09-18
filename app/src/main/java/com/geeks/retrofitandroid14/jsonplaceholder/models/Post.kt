package com.geeks.retrofitandroid14.jsonplaceholder.models

import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("body")
    val body: String,
    @SerializedName("userId")
    val userId: Int
)