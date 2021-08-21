package com.example.shoeinventorybysaud

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.shoeinventorybysaud.R


class ShoesList : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shoes_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val fab = view.findViewById(R.id.fab) as Button

        fab.setOnClickListener {
            findNavController().navigate(R.id.action_shoesList_to_shoseDetailFragment)

        }
    }
}







