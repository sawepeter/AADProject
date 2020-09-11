package com.devsawe.associateandroiddeveloperpracticeproject.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.devsawe.associateandroiddeveloperpracticeproject.adapter.ViewPagerAdapter
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var actionbar : ActionBar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding=FragmentHomeBinding.inflate(inflater)
        //set toolbar
        (activity as AppCompatActivity?)!!.setSupportActionBar(binding.toolbar)
        actionbar = (activity as AppCompatActivity?)!!.supportActionBar!!
        (activity as AppCompatActivity?)!!.supportActionBar!!.setTitle("LEADERBOARD")


        binding.lifecycleOwner=viewLifecycleOwner

        binding.submitBtn.setOnClickListener(View.OnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSubmitFragment())
        })
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewPagerAdapter= ViewPagerAdapter(this)
        binding.pager.adapter =viewPagerAdapter

        TabLayoutMediator(binding.tabLayout, binding.pager) { tab, position ->
            if(position == 0){
                tab.text = "Learning Leaders"
            }
            else{
                tab.text = "Skill IQ Leaders"
            }

        }.attach()

    }
}