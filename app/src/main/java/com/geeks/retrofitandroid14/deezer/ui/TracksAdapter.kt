package com.geeks.retrofitandroid14.deezer.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.retrofitandroid14.databinding.ItemTrackBinding
import com.geeks.retrofitandroid14.deezer.models.playlist.Track

class TracksAdapter : RecyclerView.Adapter<TracksAdapter.TrackViewHolder>() {

    private val tracks = arrayListOf<Track>()

    fun setTracks(tracks: List<Track>) {
        this.tracks.addAll(tracks)
        notifyDataSetChanged()
    }

    class TrackViewHolder(private val binding: ItemTrackBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(track: Track) {
            binding.tvTitle.text = track.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackViewHolder {
        val binding = ItemTrackBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrackViewHolder(binding)
    }

    override fun getItemCount() = tracks.size

    override fun onBindViewHolder(holder: TrackViewHolder, position: Int) {
        holder.onBind(tracks[position])
    }
}