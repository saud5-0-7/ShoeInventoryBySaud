package com.example.shoeinventorybysaud.instruction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.shoeinventorybysaud.R


class InstructionFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_instrucction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val Instruction_button = view.findViewById(R.id.Instruction_button) as Button

        Instruction_button.setOnClickListener {
           findNavController().navigate(R.id.action_instrucctionFragment_to_shoesListingsFragment)
        }
    }


}