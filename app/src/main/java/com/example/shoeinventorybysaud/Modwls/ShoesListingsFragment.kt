package com.example.shoeinventorybysaud.Modwls

import android.os.Bundle
import android.view.*
import android.widget.Button
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

    private lateinit var binding: ShoesListingsFragment


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_shoes_listings, container, false)
        setHasOptionsMenu(true)

        return inflater.inflate(R.layout.fragment_shoes_listings,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val fab = view.findViewById(R.id.fab) as Button

        fab.setOnClickListener {
            findNavController().navigate(R.id.action_instrucctionFragment_to_shoesListingsFragment)
        }
    }




}


    return binding.root

}

     fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
      super.onCreateOptionsMenu(menu, inflater)
      inflater?.inflate(R.menu.login,menu)

}

     fun onOptionsItemSelected(item: MenuItem): Boolean {
     return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController())||super.onOptionsItemSelected(item)
}




}












