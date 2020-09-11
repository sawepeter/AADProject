package com.devsawe.associateandroiddeveloperpracticeproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.devsawe.associateandroiddeveloperpracticeproject.adapter.LeaderBoardAdapter
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.FragmentLeaderBinding
import com.devsawe.associateandroiddeveloperpracticeproject.utils.ARG_OBJECT
import com.devsawe.associateandroiddeveloperpracticeproject.utils.LEARNING_LEADERS
import com.devsawe.associateandroiddeveloperpracticeproject.utils.SKILL_IQ_LEADERS
import com.devsawe.associateandroiddeveloperpracticeproject.viewmodel.LeaderBoardViewModel


class LeaderFragment : Fragment() {

    private lateinit var binding:FragmentLeaderBinding
    private lateinit var viewModel: LeaderBoardViewModel
    private lateinit var adapter: LeaderBoardAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLeaderBinding.inflate(inflater)
        binding.lifecycleOwner=viewLifecycleOwner

        viewModel = ViewModelProvider(requireActivity()).get(LeaderBoardViewModel::class.java)
        binding.viewmodel=viewModel
        adapter= LeaderBoardAdapter()
        binding.leaderboardRv.adapter=adapter
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        if(position == 1){
            viewModel.fetchLeaderBoard(LEARNING_LEADERS)
            viewModel.learningLeaders.observe(viewLifecycleOwner, Observer {it->
                it.let {
                    adapter.setLeaderBoardType(LEARNING_LEADERS)
                    adapter.submitList(it)
                }
            })
        }
        else{
            viewModel.fetchLeaderBoard(SKILL_IQ_LEADERS)
            viewModel.skillLeaders.observe(viewLifecycleOwner, Observer {it->
                it.let {
                    adapter.setLeaderBoardType(SKILL_IQ_LEADERS)
                    adapter.submitList(it)
                }
            })
        }
    }
    private var position:Int=0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply{
            position = getInt(ARG_OBJECT)
        }
    }

}