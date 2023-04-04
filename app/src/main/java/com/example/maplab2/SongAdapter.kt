package com.example.maplab2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.maplab2.databinding.SongCardBinding

class SongAdapter(
    val onClick: (model: Song, position: Int) -> Unit
) : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {
    private val list = ArrayList<Song>()

    inner class SongViewHolder(val binding: SongCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindView(song: Song, position: Int) {
            val nameLines = song.name.split(" - ")
            binding.tvName.text = nameLines[1] + "\n" + nameLines[0]

            val firstLines = song.lyrics.split("\\R".toRegex(), limit = 3).toTypedArray()
            if (firstLines[0].length > 37) {
                binding.tvLyr.text = firstLines[0].substring(0, 37) + "..."
            } else if (firstLines[0].length > 20 && firstLines[0].length < 37) {
                binding.tvLyr.text = firstLines[0] + "..."
            } else if (firstLines[0].length >= 17 && firstLines[0].length <= 20) {
                binding.tvLyr.text = firstLines[0] + "\n" + "..."
            } else if (firstLines[0].length < 17 && firstLines[1].length > 17) {
                binding.tvLyr.text = firstLines[0] + "\n" + firstLines[1].substring(0, 17) + "..."
            } else if (firstLines[0].length < 17 && firstLines[1].length <= 17) {
                binding.tvLyr.text = firstLines[0] + "\n" + firstLines[1] + "..."
            }
//            binding.iv.setImageDrawable(binding.iv.context.getDrawable(song.imageId))
            Glide.with(binding.iv.context)
                .load(song.imageId)
                .into(binding.iv)

            binding.btn.setOnClickListener {
                onClick(song, position)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val view = SongCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = list[position]
        holder.bindView(song, position)
    }

    fun setNewData(newList: List<Song>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }
}