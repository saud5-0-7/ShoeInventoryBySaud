package com.example.shoeinventorybysaud.Modwls

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoeinventorybysaud.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ShoesListingsFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_shoes_listings,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val fab = view.findViewById(R.id.fab) as FloatingActionButton

        fab.setOnClickListener {
            findNavController().navigate(R.id.action_shoesListingsFragment_to_shoseDetailFragment)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
    inflater.inflate(R.menu.logout, menu)
}
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
    return when (item.itemId) {
        R.id.loginFragment -> {
            // navigate to settings screen
            true


        }
        else -> onOptionsItemSelected(item)
    }
}



























