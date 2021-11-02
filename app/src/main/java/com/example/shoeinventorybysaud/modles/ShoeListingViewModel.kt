
package com.example.shoeinventorybysaud.modles

import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoeinventorybysaud.BR
import java.util.*
import kotlin.collections.ArrayList


class ShoeListingViewModel: ViewModel(), Observable() {


    val shoeList = MutableLiveData<MutableList<Shoe>>()

    init {
        shoeList.value = ArrayList()
    }


    @Bindable
    var shoe = Shoe()
        set(value) {
            if(value != field) {
                field = value

                saveData()

                notifyPropertyChanged(BR.ShoeListingViewModel)
            }
        }

    private fun saveData() {
        TODO("Not yet implemented")
    }

    fun addShoe(name: String, size: String, company: String, description: String) {
        val shoe = Shoe(name, size, company, description)
        shoeList.value?.add(shoe)
        shoeList.value = shoeList.value


    }

    }







