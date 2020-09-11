package com.devsawe.associateandroiddeveloperpracticeproject.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.devsawe.associateandroiddeveloperpracticeproject.network.ProjectSubmissionApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.await
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