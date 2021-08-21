package com.example.shoeinventorybysaud
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.shoeinventorybysaud.R

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        return inflater.inflate(R.layout.fragment_welcom, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val next_button = view.findViewById(R.id.next_button) as Button

        next_button.setOnClickListener {
           findNavController().navigate(R.id.action_welcomFragment_to_instrucctionFragment)
        }

    }

}