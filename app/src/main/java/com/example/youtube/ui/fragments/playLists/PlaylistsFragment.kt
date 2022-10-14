package com.example.youtube.ui.fragments.playLists

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.youtube.R
import com.example.youtube.core.UIState
import com.example.youtube.databinding.FragmentPlaylistsBinding
import com.example.youtube.tools.Constasnts
import com.example.youtube.tools.Constasnts.showToast
import com.example.youtube.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlaylistsFragment : BaseFragment<FragmentPlaylistsBinding>(R.layout.fragment_playlists) {

    override val binding by viewBinding(FragmentPlaylistsBinding::bind)
    private val viewModel: PlaylistsViewModel by viewModel()

    override fun setupRequests() {
        viewModel.fetchPlaylists()
    }

    override fun setupObservers() {
        viewModel.playlists.observe(viewLifecycleOwner) { state ->
            when (state) {
                is UIState.Loading -> {
                    binding.progressBar.visibility = Constasnts.VISIBLE
                }
                is UIState.Error -> {
                    binding.progressBar.visibility = Constasnts.INVISIBLE
                    requireContext().showToast(state.message)
                }
                is UIState.Success -> {
                    binding.progressBar.visibility = Constasnts.INVISIBLE
                    requireContext().showToast(state.data.toString())
                }
            }
        }
    }

}