package com.example.shoeinventorybysaud.Modwls

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class shoeListingViewModel : ViewModel(){


    val shoeList = MutableLiveData<MutableList<Shoe>>()

    init {
        shoeList.value = ArrayList()
    }



    data class Shoe(
        var name: String = "",
        var size: String = "",
        var company: Double = 0.0,
        var description: String = ""
    )
    }




