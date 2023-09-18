package com.geeks.retrofitandroid14.deezer.data.repositories

import com.geeks.retrofitandroid14.deezer.data.remote.apiservices.PlaylistApiService
import com.geeks.retrofitandroid14.deezer.models.playlist.Playlist
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlaylistRepository(private val playlistApiService: PlaylistApiService) {

    fun getPlaylist(
        id: Int,
        onSuccess: (data: Playlist) -> Unit,
        onFailure: (message: String) -> Unit
    ) {
        playlistApiService.getPlaylist(id).enqueue(object : Callback<Playlist> {
            override fun onResponse(call: Call<Playlist>, response: Response<Playlist>) {
                if (response.isSuccessful) {
                    response.body()?.let(onSuccess)
                }
            }

            override fun onFailure(call: Call<Playlist>, t: Throwable) {
                onFailure(t.localizedMessage ?: "Error Occurred!")
            }
        })
    }
}