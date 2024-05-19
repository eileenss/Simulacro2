package com.example.simulacro2.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import com.example.simulacro2.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

        private lateinit var bottomNavView : BottomNavigationView
        private lateinit var navHostFragment : NavHostFragment


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_main)
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }

            navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment

            bottomNavView = findViewById(R.id.bottom_nav)

            NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)
        }
    }






