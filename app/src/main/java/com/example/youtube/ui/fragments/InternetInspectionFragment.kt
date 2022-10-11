package com.example.youtube.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.youtube.R
import com.example.youtube.databinding.FragmentInternetInspectionBinding

class InternetInspectionFragment : Fragment() {

    lateinit var binding: FragmentInternetInspectionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInternetInspectionBinding.inflate(inflater)
        return binding.root
    }
}