package com.devsawe.associateandroiddeveloperpracticeproject.model

import androidx.annotation.Keep
import com.squareup.moshi.Json

@Keep
data class LeaderBoardModelItem(
    val name: String,
    @Json(name="hours")
    var hours: Int?=null,
    @Json(name="score")
    var score: Int?=null,
    val country: String,
    val badgeUrl: String
)