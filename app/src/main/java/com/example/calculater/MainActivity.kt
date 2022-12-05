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
            adding()
        }
        binding.btnRem.setOnClickListener {
            removing()
        }
        binding.btnDivide.setOnClickListener {
            dividing()
        }
    }

    private fun dividing() {
        var firstNum = binding.edFirstNum.text.toString()
        var calc = firstNum.toDouble()
        var secondNum = binding.edSecondNum.text.toString()
        var calc2 = secondNum.toDouble()
        var dividing = calc / calc2
        var dividing1 = dividing.toString()
        binding.txtResult.text=getString(R.string.add, dividing1)
    }

    private fun removing() {
        var firstNum = binding.edFirstNum.text.toString()
        var calc = firstNum.toDouble()
        var secondNum = binding.edSecondNum.text.toString()
        var calc2 = secondNum.toDouble()
        var removing = calc - calc2
        var removing1 =removing.toString()
        binding.txtResult.text=getString(R.string.add,removing1)
    }

    private fun adding() {
        var firstNum = binding.edFirstNum.text.toString()
        var calc = firstNum.toDouble()
        var secondNum = binding.edSecondNum.text.toString()
        var calc2 = secondNum.toDouble()
        var adding = calc + calc2
        var adding1 = adding.toString()
        binding.txtResult.text=getString(R.string.add, adding1)
    }
}