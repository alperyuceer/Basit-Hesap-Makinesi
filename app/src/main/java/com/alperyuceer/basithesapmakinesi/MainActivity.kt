package com.alperyuceer.basithesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alperyuceer.basithesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
    fun topla(view: View){
        var sonuc= binding.number1.text.toString().toInt() + binding.number2.text.toString().toInt()
        binding.sonuc.text = "SONUÇ: ${sonuc}"
    }
    fun cikar(view: View){
        var sonuc= binding.number1.text.toString().toInt() - binding.number2.text.toString().toInt()
        binding.sonuc.text = "SONUÇ: ${sonuc}"
    }
    fun carp(view: View){
        var sonuc= binding.number1.text.toString().toInt() * binding.number2.text.toString().toInt()
        binding.sonuc.text = "SONUÇ: ${sonuc}"
    }
    fun bol(view: View){
        var sonuc= binding.number1.text.toString().toDouble() / binding.number2.text.toString().toDouble()
        binding.sonuc.text = "SONUÇ: ${sonuc}"
    }

}