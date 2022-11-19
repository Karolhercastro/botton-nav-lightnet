package com.example.bottomnavigationkotlin

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.navBottomNavigationView)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navFragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        AppBarConfiguration(navController.graph)
        navView.setupWithNavController(navController)
    }
}