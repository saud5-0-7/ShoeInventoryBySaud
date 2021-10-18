package com.example.shoeinventorybysaud.Modwls

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeListingViewModel(name: String, company: Double, size: String, description: String) : ViewModel() {

    val shoeList = MutableLiveData<MutableList<Shoe>>()

    init {
        shoeList.value = ArrayList()
    }

    fun addShoe(name: String, company: String, size: Double, description: String) {
        var shoe: Shoe = Shoe(name, company, size, description)
        shoeList.value?.add(shoe)
        shoeList.value = shoeList.value


    }


}
