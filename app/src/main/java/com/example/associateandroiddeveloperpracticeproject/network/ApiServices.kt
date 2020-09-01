package com.example.associateandroiddeveloperpracticeproject.network

import com.example.associateandroiddeveloperpracticeproject.model.LeaderBoardModelItem
import com.example.associateandroiddeveloperpracticeproject.utils.FORMM_ID
import com.example.associateandroiddeveloperpracticeproject.utils.FORM_URL
import com.example.associateandroiddeveloperpracticeproject.utils.LEADER_BOARD_BASE_URL
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.*

interface LeaderBoardServices {
    @GET("{type}")
    fun fetchLeaderBoardAsync(@Path("type") type: String?): Deferred<List<LeaderBoardModelItem>>
}
interface SubmitProjectService {
    @POST(FORMM_ID)
    @FormUrlEncoded
    fun submitProject(@Field("entry.1824927963") email: String?,
               @Field("entry.1877115667") firstName: String?,
               @Field("entry.2006916086") lastName: String?,
               @Field("entry.284483984") projectLink: String?):Call<Void?>

}
object ProjectSubmissionApi{
    private val retrofitApi= Retrofit.Builder()
        .baseUrl(FORM_URL)
        .build()
    val instance: SubmitProjectService = retrofitApi.create(SubmitProjectService::class.java)
}
object LeaderBoardApi{
    private val retrofitApi= Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .baseUrl(LEADER_BOARD_BASE_URL)
        .build()
    val instance: LeaderBoardServices = retrofitApi.create(LeaderBoardServices::class.java)
}


