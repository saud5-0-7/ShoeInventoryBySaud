package com.example.shoeinventorybysaud

import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

//
class LoginFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       return inflater.inflate(R.layout.fragment_login,container,false)



        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val EmailEditText = view.findViewById(R.id.email_edit_text)
        val passwordEditText = view.findViewById(R.id.password_edit_text)
        val loginButton = view.findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val Email = EmailEditText.text.toString()
            val password = passwordEditText.text.toString()

            findNavController().navigate(R.id.action_loginFragment_to_welcomFragment)
        }
    }
    }









