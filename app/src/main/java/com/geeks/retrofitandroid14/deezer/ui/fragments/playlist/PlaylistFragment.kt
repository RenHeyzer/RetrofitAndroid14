package com.geeks.retrofitandroid14.deezer.ui.fragments.playlist

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.geeks.retrofitandroid14.R
import com.geeks.retrofitandroid14.databinding.FragmentPlaylistBinding
import com.geeks.retrofitandroid14.deezer.ui.TracksAdapter
import com.google.android.material.snackbar.Snackbar

class PlaylistFragment : Fragment() {

    private var _binding: FragmentPlaylistBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<PlaylistViewModel>()
    private val tracksAdapter = TracksAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPlaylistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecycler()
        onSubmit()
        subscribeToPlaylist()
    }

    private fun setupRecycler() {
        binding.rvTracks.adapter = tracksAdapter
    }

    private fun onSubmit() = with(binding) {
        btnSubmit.setOnClickListener {
            val playlistId = etInputPlaylistId.text.toString()
            if (playlistId.isNotEmpty()) {
                viewModel.getPlaylist(playlistId.toInt())
            } else {
                etInputPlaylistId.error = getString(R.string.et_input_playlist_id_error_message)
            }
        }
    }

    private fun subscribeToPlaylist() {
        viewModel.playlistLiveData.observe(viewLifecycleOwner) {
            it.data?.let { playlist ->
                tracksAdapter.setTracks(playlist.tracks.data)
            }
            it.message?.let { message ->
                Log.e("error", message)
                Snackbar.make(binding.root, message, 5000).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}