package com.example.associateandroiddeveloperpracticeproject.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem
import com.example.associateandroiddeveloperpracticeproject.network.LeaderBoardApi
import com.example.associateandroiddeveloperpracticeproject.network.ProjectSubmissionApi
import com.example.associateandroiddeveloperpracticeproject.utils.SUBMITTED
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.await
import retrofit2.http.Field
import java.lang.Exception

class SubmitRepository {
    var response = MutableLiveData<Boolean>()


    suspend fun postSubmit(firstName: String?, lastName: String?, email: String?, projectLink: String?) {
        withContext(Dispatchers.IO){
            val learningLeadersList= ProjectSubmissionApi.instance.submitProject(email,firstName,lastName,projectLink)
            try{
                learningLeadersList.await()
                response.postValue(true)
            }
            catch (e: Exception){
                Log.d("error2",e.message!!)
                response.postValue(false)

            }
        }
    }

}