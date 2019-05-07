package com.zanella.helper

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_bottom_bar.*

class BottomBarActivity : AppCompatActivity() {
    private lateinit var  frameLayout_ContainerForFragment: FrameLayout
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                //message.setText(R.string.title_home)
                val fragmentHome = HomeFragment()
                managerFragment(fragmentHome, "HOME_FRAGMENT")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
                //message.setText(R.string.title_search)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_my_posts -> {
                //message.setText(R.string.title_my_posts)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_profile -> {
                //message.setText(R.string.title_profile)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_bar)

        frameLayout_ContainerForFragment = findViewById(R.id.containerForFragment)

        val navigation: BottomNavigationView = findViewById(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val mainFragment = HomeFragment()
        managerFragment(mainFragment, "MAIN_FRAGMENT")
    }

    private fun managerFragment(fragment: Fragment, tag: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.containerForFragment, fragment, tag)
        fragmentTransaction.commit()
    }
}
