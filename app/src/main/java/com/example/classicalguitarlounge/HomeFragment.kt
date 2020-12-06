package com.example.classicalguitarlounge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.classicalguitarlounge.guitars.GuitarsFragment
import com.example.classicalguitarlounge.posts.PostsFragment
import com.example.classicalguitarlounge.saved.SavedFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : Fragment() {

    private lateinit var mainBottomNav: BottomNavigationView

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.action_home -> {
                navigate(PostsFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_guitars -> {
                navigate(GuitarsFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_saved -> {
                navigate(SavedFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_profile -> {
                navigate(PostsFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false).apply{
            mainBottomNav = findViewById(R.id.main_bottom_nav_bnv)
            mainBottomNav.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
            navigate(PostsFragment())
        }
    }

    private fun navigate(fragment: Fragment){
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_fragment_container, fragment)
            .commit()
    }
}