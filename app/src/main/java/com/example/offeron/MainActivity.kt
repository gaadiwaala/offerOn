package com.example.offeron

import android.annotation.SuppressLint
import android.os.Bundle
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout


import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)


        appBarConfiguration = AppBarConfiguration(
            setOf(
                        R.id.nav_home, R.id.nav_myprofile, R.id.nav_myorder, R.id.nav_mywishlist, R.id.nav_notification,R.id.nav_mychats,R.id.nav_mycoupans,R.id.nav_settings,R.id.nav_privacypolicy,R.id.nav_contactus,R.id.nav_logout
                ), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        val bottomNavView: BottomNavigationView = findViewById(R.id.bottom_nav1)
        bottomNavView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }



    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private val mOnNavigationItemSelectedListener =
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.btm_search -> {
                        findNavController(R.id.nav_host_fragment).navigate(R.id.btm_search)
                    }
                    R.id.btm_cartview -> {
                        findNavController(R.id.nav_host_fragment).navigate(R.id.btm_cartview)
                    }
                    R.id.btm_home -> {
                        findNavController(R.id.nav_host_fragment).navigate(R.id.btm_home)
                    }
                    R.id.btm_chat -> {
                        findNavController(R.id.nav_host_fragment).navigate(R.id.btm_chat)
                    }
                    R.id.btm_play-> {
                        findNavController(R.id.nav_host_fragment).navigate(R.id.btm_play)
                    }

                }
                false
            }
}