package com.example.youtube.ui.fragments.playLists

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.youtube.R
import com.example.youtube.databinding.FragmentPlaylistsBinding
import com.example.youtube.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistsFragment : BaseFragment<FragmentPlaylistsBinding>(R.layout.fragment_playlists) {

    override val binding by viewBinding(FragmentPlaylistsBinding::bind)
    private val viewModel: PlaylistsViewModel by viewModel()

}