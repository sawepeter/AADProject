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

class SubmitProjectViewModel (): ViewModel() {

    private val viewModelJob= SupervisorJob()
    private val viewModelScope= CoroutineScope(viewModelJob+Dispatchers.Main)
    private val submitRepository = SubmitRepository()

    val submitResponse:LiveData<Boolean>
    get() = mSubmitResponse
    val mSubmitResponse=MutableLiveData<Boolean>()
    fun postSunmit(firstName: String?, lastName: String?, email: String?, projectLink: String?){
        viewModelScope.launch {
            submitRepository.postSubmit(firstName,lastName,email,projectLink)
            try{
                mSubmitResponse.postValue(submitRepository.response.value)
            }
            catch (e :Exception){
                Log.d("error",e.message!!)
                mSubmitResponse.postValue(false)
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

}