package com.example.shoeinventorybysaud.modles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.shoeinventorybysaud.R
import com.example.shoeinventorybysaud.databinding.FragmentShoseDetailBinding


class ShoseDetailFragment : Fragment() {

    private lateinit var binding: FragmentShoseDetailBinding
    private val shoeListingViewModel: ShoeListingViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShoseDetailBinding.inflate(layoutInflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val shoe_name = view.findViewById(R.id.shoe_name) as EditText
        val company_name = view.findViewById(R.id.company_name) as EditText
        val shoe_size = view.findViewById(R.id.shoe_size) as EditText
        val description = view.findViewById(R.id.description) as EditText

        binding.saveButton.setOnClickListener {
            shoe_name.text.toString()
            company_name.text.toString()
            shoe_size.text.toString()
            description.text.toString()

            findNavController().navigate(R.id.action_shoseDetailFragment_to_shoesListingsFragment)


        }

        binding.cancelButton.setOnClickListener {

            binding.shoeName.text.clear()
            binding.companyName.text.clear()
            binding.shoeSize.text.clear()
            binding.description.text.clear()

            findNavController().navigate(R.id.action_shoseDetailFragment_to_shoesListingsFragment)


        }


    }

}