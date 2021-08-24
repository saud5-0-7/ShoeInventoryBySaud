package com.example.shoeinventorybysaud.screen.welcom.shosedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shoeinventorybysaud.R


class ShoseDetailFragment : Fragment() {
   
    

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shose_detail, container, false)
    }

    
}