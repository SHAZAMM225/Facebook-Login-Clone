package com.example.clone_facebook_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),TextWatcher {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email.addTextChangedListener(this)
        password.addTextChangedListener(this)

logo.visibility=View.VISIBLE
        logo.animate().translationY(-500f)
            .scaleX(0.7f)
            .scaleY(0.7f)
            .duration=1000
    }






    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        llogin.isEnabled=email.text.isNotEmpty() && password.text.isNotEmpty()

    }

    override fun afterTextChanged(s: Editable?) {

    }
}