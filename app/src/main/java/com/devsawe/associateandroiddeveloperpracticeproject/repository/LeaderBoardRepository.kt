package com.devsawe.associateandroiddeveloperpracticeproject.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.devsawe.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem
import com.devsawe.associateandroiddeveloperpracticeproject.network.LeaderBoardApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

class LeaderBoardRepository {
    var learningLeadersMLiveData = MutableLiveData<List<LeaderBoardModelItem>>()

    suspend fun fetchLearningLeaders(leaderBoardType: String) {
        withContext(Dispatchers.IO){
            val learningLeadersList=LeaderBoardApi.instance.fetchLeaderBoardAsync(leaderBoardType)
            try{
                val result=learningLeadersList.await()
                learningLeadersMLiveData.postValue(result)
            }
            catch (e:Exception){
                Log.d("error",e.message!!)
            }
        }
    }
}