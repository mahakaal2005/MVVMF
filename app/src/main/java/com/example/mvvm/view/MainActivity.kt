package com.example.mvvm.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.R
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.model.CalculatorData
import com.example.mvvm.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        calculatorViewModel= ViewModelProvider(this).get(CalculatorViewModel::class.java)
        binding.btn.setOnClickListener {
            val num1=binding.edt1.text.toString().toIntOrNull()?:0 //if not int or null value is given then value=0
            val num2=binding.edt2.text.toString().toIntOrNull()?:0
            val result=calculatorViewModel.add(num1,num2)
            binding.result.text="Result: ${result.result}"
        }
    }
}