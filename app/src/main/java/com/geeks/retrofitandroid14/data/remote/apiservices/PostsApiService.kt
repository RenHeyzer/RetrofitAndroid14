package com.geeks.retrofitandroid14.data.remote.apiservices

import com.geeks.retrofitandroid14.models.Post
import retrofit2.Call
import retrofit2.http.GET

interface PostsApiService {

    @GET("posts")
    fun fetchPosts(): Call<List<Post>>
}