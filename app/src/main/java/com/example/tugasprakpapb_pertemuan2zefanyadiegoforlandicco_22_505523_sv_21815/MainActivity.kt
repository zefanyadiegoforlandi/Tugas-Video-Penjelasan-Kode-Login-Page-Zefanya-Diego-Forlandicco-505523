

package com.example.loginscreen

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:  ActivityMainBinding
    private lateinit var admin: String
    private lateinit var passwordAdmin: String

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        admin= "newton"
        passwordAdmin = "gravitasi"

        with(binding){

            LogButton.setOnClickListener {

                if(username1.text.toString() == admin &&
                    password.text.toString() == passwordAdmin){
                    Toast.makeText(this@MainActivity, "Login Sukses", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this@MainActivity, "Username atau password salah", Toast.LENGTH_SHORT).show()
                }

            }

        }
    }}