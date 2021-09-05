package com.example.shoeinventorybysaud.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.shoeinventorybysaud.R

//
class LoginFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       return inflater.inflate(R.layout.fragment_login,container,false)



        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val EmailEditText = view.findViewById(R.id.email_edit_text)as EditText
        val passwordEditText = view.findViewById(R.id.password_edit_text)as EditText
        val loginButton = view.findViewById(R.id.loginButton) as Button

        loginButton.setOnClickListener {
            val Email = EmailEditText.text.toString()
            val password = passwordEditText.text.toString()

            findNavController().navigate(R.id.action_loginFragment_to_welcomFragment)
        }
    }
    }









