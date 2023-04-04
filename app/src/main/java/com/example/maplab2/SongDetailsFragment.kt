package com.example.maplab2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.maplab2.databinding.FragmentSongDetailsBinding

class SongDetailsFragment : Fragment() {

    lateinit var binding: FragmentSongDetailsBinding

    val args: SongDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongDetailsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        args.songDetails.let {
            val nameLines = args.songDetails.name.split(" - ")
            binding.tvName.text = nameLines[1] + "\n" + nameLines[0]
            binding.tvLyr.text = args.songDetails.lyrics
//            binding.iv.setImageDrawable(binding.iv.context.getDrawable(args.songDetails.imageId))
            Glide.with(binding.iv.context)
                .load(args.songDetails.imageId)
                .into(binding.iv)
            binding.btnBack.setOnClickListener {
                findNavController().navigate(SongDetailsFragmentDirections.actionSongDetailsFragmentToSongListFragment())
            }
        }
    }
}