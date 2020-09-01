package com.example.associateandroiddeveloperpracticeproject.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.associateandroiddeveloperpracticeproject.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private lateinit var binding : FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSplashBinding.inflate(inflater)

        Handler(Looper.myLooper()!!).postDelayed({
            context?.let {
                val action= SplashFragmentDirections.actionSplashFragmentToHomeFragment()
                findNavController().navigate(action)
            }
        }, 1)
        return binding.root
    }


}