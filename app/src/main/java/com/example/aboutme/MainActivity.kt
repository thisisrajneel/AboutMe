package com.example.aboutme


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    var myname : MyName = MyName("Rajneel", "")
//    lateinit var inputNickname : EditText
//    lateinit var doneButton : Button
//    lateinit var displayNickname : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myname

//        inputNickname = findViewById(R.id.input_nickname)
//        doneButton = findViewById(R.id.btnDone)
//        displayNickname = findViewById(R.id.tvNickname)

        binding.btnDone.setOnClickListener {
            takeNickname()
        }
    }

    private fun takeNickname() {

        if (binding.inputNickname.text.isBlank() || binding.inputNickname.text.isEmpty()) {
            Toast.makeText(this, "What do your friends call you?", Toast.LENGTH_SHORT).show()
        }
        else {
            binding.myName.nickname = binding.inputNickname.text.toString()
            //binding.tvNickname.text = binding.myName?.nickname
            binding.tvNickname.visibility = View.VISIBLE
            binding.inputNickname.visibility = View.GONE
            binding.btnDone.visibility = View.GONE
        }

    }
}