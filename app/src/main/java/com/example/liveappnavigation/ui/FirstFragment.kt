package com.example.liveappnavigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.liveappnavigation.R
import com.example.liveappnavigation.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.firstFragmentCL.setOnClickListener {
            val text = binding.textET.text.toString()

            if (text.isNotBlank()) {
                findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(text))
            }
        }

    }
}