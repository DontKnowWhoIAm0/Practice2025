package com.example.secondtask

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText

class InputFragment : Fragment(R.layout.fragment_for_input) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputNumber = view.findViewById<TextInputEditText>(R.id.numberInput)
        val btn = view.findViewById<Button>(R.id.btn)

        val watcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val number = inputNumber.text.toString()
                btn.isEnabled = isCorrect(number)
            }
        }

        inputNumber.addTextChangedListener(watcher)

        btn.setOnClickListener {
            val count = inputNumber.text.toString().toInt()
            Models.generateList(count)
            findNavController().navigate(R.id.action_inputFragment_to_listFragment)
        }
    }

    fun isCorrect(input : String): Boolean {
        val number = input.toIntOrNull()
        return (number != null && number in 1..10)
    }
}