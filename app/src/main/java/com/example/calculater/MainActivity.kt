package com.example.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculater.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.btnAdd.setOnClickListener {
            var firstNum = binding.edFirstNum.text.toString()
            var calc = firstNum.toDouble()
            var secondNum = binding.edSecondNum.text.toString()
            var calc2 = secondNum.toDouble()
            var adding = calc + calc2
            binding.txtResult.text=getString(R.string.add, adding)

        }
        binding.btnRem.setOnClickListener {
            var firstNum = binding.edFirstNum.text.toString()
            var calc = firstNum.toDouble()
            var secondNum = binding.edSecondNum.text.toString()
            var calc2 = secondNum.toDouble()
            var removeing = calc - calc2
            binding.txtResult.text=getString(R.string.add,removeing)

        }
        binding.btnDivide.setOnClickListener {
            var firstNum = binding.edFirstNum.text.toString()
            var calc = firstNum.toDouble()
            var secondNum = binding.edSecondNum.text.toString()
            var calc2 = secondNum.toDouble()
            var dividing = calc / calc2
            binding.txtResult.text=getString(R.string.add, dividing)

        }
    }
}