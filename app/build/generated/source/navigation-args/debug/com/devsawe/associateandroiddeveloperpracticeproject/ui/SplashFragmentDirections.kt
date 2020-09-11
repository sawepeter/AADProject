package com.devsawe.associateandroiddeveloperpracticeproject.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.devsawe.associateandroiddeveloperpracticeproject.R

class SplashFragmentDirections private constructor() {
  companion object {
    fun actionSplashFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_homeFragment)
  }
}
