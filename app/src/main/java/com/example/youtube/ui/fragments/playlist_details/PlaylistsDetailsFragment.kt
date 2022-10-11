package com.example.youtube.ui.fragments.playlist_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.youtube.R
import com.example.youtube.databinding.FragmentPlaylistsBinding
import com.example.youtube.databinding.FragmentPlaylistsDetailsBinding
import com.example.youtube.ui.base.BaseFragment
import com.example.youtube.ui.fragments.playLists.PlaylistsViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistsDetailsFragment : BaseFragment<FragmentPlaylistsDetailsBinding>(R.layout.fragment_playlists_details) {

    override val binding by viewBinding(FragmentPlaylistsDetailsBinding::bind)
    private val viewModel: PlaylistsDetailsViewModel by viewModel()

}