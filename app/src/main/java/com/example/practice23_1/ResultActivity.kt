package com.example.practice23_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.practice23_1.databinding.ActivityResultBinding

private lateinit var binding: ActivityResultBinding
class ResultActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnToast.setOnClickListener {
            take_result()
        }
    }
    fun take_result() {
        Toast.makeText(this, "Успешно", Toast.LENGTH_SHORT).show()
    }
}