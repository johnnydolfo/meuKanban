package com.joaorodolfo.meukanban.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.joaorodolfo.meukanban.R
import com.joaorodolfo.meukanban.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}