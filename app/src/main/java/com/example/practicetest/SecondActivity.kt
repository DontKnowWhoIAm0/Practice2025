package com.example.practicetest

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var emailText = findViewById<TextInputEditText>(R.id.emailText)
        var passText = findViewById<TextInputEditText>(R.id.passText)
        var actionButton = findViewById<Button>(R.id.button1)

        val watcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val email = emailText.text.toString()
                val pass = passText.text.toString()
                val isEmailValid = Patterns.EMAIL_ADDRESS.matcher(email).matches()
                val isPassValid = isPasswordValid(pass)

                actionButton.isEnabled = isEmailValid && isPassValid
            }
        }
        emailText.addTextChangedListener(watcher)
        passText.addTextChangedListener(watcher)

        actionButton.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("email", emailText.text.toString())
            intent.putExtra("pass", passText.text.toString())
            startActivity(intent)
        }
    }

    fun isPasswordValid(pass: String): Boolean {
        if (pass.length < 8) return false
        val digit = pass.any {c -> c.isDigit()}
        val upper = pass.any {c -> c.isUpperCase()}
        val lower = pass.any {c -> c.isLowerCase()}

        return digit && upper && lower
    }
}