package com.devsawe.associateandroiddeveloperpracticeproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import com.devsawe.associateandroiddeveloperpracticeproject.R
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.ActivityMainBinding
import com.devsawe.associateandroiddeveloperpracticeproject.databinding.FragmentSplashBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController

    }

    override fun onNavigateUp(): Boolean {
        return super.onNavigateUp()
    }
}