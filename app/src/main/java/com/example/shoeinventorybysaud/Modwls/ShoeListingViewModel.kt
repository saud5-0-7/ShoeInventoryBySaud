package com.example.shoeinventorybysaud.Modwls

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class shoeListingViewModel : ViewModel() {


    val shoeList = MutableLiveData<MutableList<Shoe>>()

    init {
        shoeList.value = ArrayList()
    }

    fun addShoe(name: String, size: String, company: String, description: String) {
        var shoe: Shoe = Shoe(name, size, company, description)
        shoeList.value?.add(shoe)
        shoeList.value = shoeList.value


    }

    fun addDummyData(){
        addShoe("", "9", "Adidas", "Great shoes")
        addShoe("Pumaaaaaaaa", "9", "Adidas", "Great shoes")

    }


}




