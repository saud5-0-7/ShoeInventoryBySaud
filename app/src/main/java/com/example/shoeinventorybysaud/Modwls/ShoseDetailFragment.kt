package com.example.shoeinventorybysaud.Modwls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.shoeinventorybysaud.R


class ShoseDetailFragment(name: String) : Fragment() {

    private lateinit var binding: ShoseDetailFragment


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_shose_detail, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val shoe_name = view.findViewById(R.id.shoe_name) as EditText
        val company_name = view.findViewById(R.id.company_name) as EditText
        val shoe_size = view.findViewById(R.id.shoe_size) as EditText
        val description = view.findViewById(R.id.description) as EditText

        binding.saveButton.setOnClickListener {
            val shoe_name = shoe_name.text.toString()
            val company_name = company_name.text.toString()
            val shoe_size = shoe_size.text.toString()
            val description = description.text.toString()

            findNavController().navigate(R.id.action_shoseDetailFragment_to_shoesListingsFragment)


        }

        binding.cancelButton.setOnClickListener {

            binding.shoe_name.text.clear()
            binding.company_name.text.clear()
            binding.shoe_size.text.clear()
            binding.description.text.clear()

            findNavController().navigate(R.id.action_shoseDetailFragment_to_shoesListingsFragment)



        }
        return binding.root

    }

}