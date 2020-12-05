package com.example.classicalguitarlounge

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : Fragment() {

    private lateinit var mainBottomNav: BottomNavigationView
    private lateinit var iconOne: BottomNavigationItemView
    private lateinit var iconTwo: BottomNavigationItemView
    private lateinit var iconThree: BottomNavigationItemView

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.action_recents -> {
                Toast.makeText(requireContext(), "Recents", Toast.LENGTH_LONG).show()
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_nearby -> {
                Toast.makeText(requireContext(), "Nearby", Toast.LENGTH_LONG).show()
                return@OnNavigationItemSelectedListener true
            }
            R.id.action_favorites -> {
                Toast.makeText(requireContext(), "Favorites", Toast.LENGTH_LONG).show()
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
            iconOne = findViewById(R.id.action_recents)
            iconTwo = findViewById(R.id.action_nearby)
            iconThree = findViewById(R.id.action_favorites)
            mainBottomNav.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        }
    }
}