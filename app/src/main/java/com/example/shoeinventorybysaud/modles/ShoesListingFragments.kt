package com.example.shoeinventorybysaud.modles

import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.shoeinventorybysaud.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ShoesListingFragments : Fragment() {

    private lateinit var binding:ShoesListingFragments
    private val  shoeListingViewModel : ShoeListingViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val binding: ViewDataBinding? = DataBindingUtil.setContentView(this, R.layout.fragment_shoes_listings)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val fab = view.findViewById(R.id.fab) as FloatingActionButton

        shoeListingViewModel.shoeList.observe(viewLifecycleOwner) {
            val iterator = it.listIterator()
            for (item in iterator) {
                val _name = TextView(this.context)
                _name.text = item.name
                val _size = TextView(this.context)
                _size.text = item.size
                val _company = TextView(this.context)
                _company.text = item.company.toString()
                val _description = TextView(this.context)
                _description.text = item.description

            }

        }


        fab.setOnClickListener {
            findNavController().navigate(R.id.action_shoesListingsFragment_to_shoseDetailFragment)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)



    }

        override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
            inflater.inflate(R.menu.main_menu, menu)
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            return when (item.itemId) {
                R.id.logout -> {

                    findNavController().navigate(R.id.action_shoesListingsFragment_to_loginFragment)

                    true

                }
                else -> super.onOptionsItemSelected(item)
            }
        }
    }





























