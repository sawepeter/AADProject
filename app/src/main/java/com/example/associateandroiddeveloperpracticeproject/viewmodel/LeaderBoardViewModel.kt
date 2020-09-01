package com.example.associateandroiddeveloperpracticeproject.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem
import com.example.associateandroiddeveloperpracticeproject.repository.LeaderBoardRepository
import com.example.associateandroiddeveloperpracticeproject.repository.SubmitRepository
import com.example.associateandroiddeveloperpracticeproject.utils.LEARNING_LEADERS
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.lang.Exception

class LeaderBoardViewModel (): ViewModel() {

    private val viewModelJob= SupervisorJob()
    private val viewModelScope= CoroutineScope(viewModelJob+Dispatchers.Main)
    private val leaderBoardRepository = LeaderBoardRepository()
    private val submitRepository = SubmitRepository()

    val learningLeaders: LiveData<List<LeaderBoardModelItem>>
        get() = mLearningLeaders
    private val mLearningLeaders = MutableLiveData<List<LeaderBoardModelItem>>()

    val skillLeaders: LiveData<List<LeaderBoardModelItem>>
        get() = mSkillLeaders
    private val mSkillLeaders = MutableLiveData<List<LeaderBoardModelItem>>()
    fun fetchLeaderBoard(leaderBoardType: String){

        viewModelScope.launch {
            try{

                leaderBoardRepository.fetchLearningLeaders(leaderBoardType)
                if(leaderBoardType == LEARNING_LEADERS) {
                    mLearningLeaders.value = leaderBoardRepository.learningLeadersMLiveData.value
                }
                else{
                    mSkillLeaders.value = leaderBoardRepository.learningLeadersMLiveData.value
                }
            }
            catch (e :Exception){
                Log.d("error",e.message!!)
            }
        }
    }


    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

}