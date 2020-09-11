package com.devsawe.associateandroiddeveloperpracticeproject.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.devsawe.associateandroiddeveloperpracticeproject.R

class HomeFragmentDirections private constructor() {
  companion object {
    fun actionHomeFragmentToSubmitFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_submitFragment)
  }
}
