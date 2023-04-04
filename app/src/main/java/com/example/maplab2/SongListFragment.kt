package com.example.maplab2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.maplab2.databinding.FragmentSongListBinding

class SongListFragment : Fragment() {

    lateinit var binding: FragmentSongListBinding

    lateinit var adapter: SongAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rv = binding.rv

        adapter = SongAdapter { song, position ->
            findNavController().navigate(
                SongListFragmentDirections.actionSongListFragmentToSongDetailsFragment(
                    song
                )
            )
        }
        adapter.setNewData(createSongs())

        rv.adapter = adapter
    }
}