package com.example.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvm.model.CalculatorData

class CalculatorViewModel:ViewModel() {


    fun add(num1:Int,num2:Int):CalculatorData{
        val result = num1 + num2
        return CalculatorData(num1,num2,result)
    }


}