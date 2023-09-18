package com.geeks.retrofitandroid14.deezer.ui.fragments.playlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.geeks.retrofitandroid14.App
import com.geeks.retrofitandroid14.deezer.data.repositories.PlaylistRepository
import com.geeks.retrofitandroid14.deezer.models.playlist.Playlist

class PlaylistViewModel : ViewModel() {

    private val playlistRepository = PlaylistRepository(App.retrofitClient.playlistApiService)

    private val _playlistLiveData = MutableLiveData<DeezerUiState<Playlist>>()
    val playlistLiveData: LiveData<DeezerUiState<Playlist>> = _playlistLiveData

    fun getPlaylist(id: Int) {
        playlistRepository.getPlaylist(
            id = id,
            onSuccess = {
                _playlistLiveData.value = DeezerUiState(data = it)
            },
            onFailure = {
                _playlistLiveData.value = DeezerUiState(message = it)
            }
        )
    }
}

data class DeezerUiState<T>(
    val isLoading: Boolean = true,
    val message: String? = null,
    val data: T? = null
)