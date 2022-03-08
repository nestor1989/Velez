package com.idea3d.velez.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idea3d.velez.MainActivity
import com.idea3d.velez.R
import com.idea3d.velez.databinding.ActivityLoginBinding
import com.idea3d.velez.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonSignIn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}