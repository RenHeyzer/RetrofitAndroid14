package com.geeks.retrofitandroid14.deezer.data.remote.apiservices

import com.geeks.retrofitandroid14.deezer.models.playlist.Playlist
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PlaylistApiService {

    @GET("playlist/{id}")
    fun getPlaylist(
        @Path("id") id: Int,
        @Query("rapidapi-key") key: String = "9ddb576d33mshcd8ea8c7a4bddc0p118e66jsnc6ac7f923d46"
    ): Call<Playlist>
}