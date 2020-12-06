package com.example.classicalguitarlounge.login

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import com.example.classicalguitarlounge.R
import com.google.android.material.textfield.TextInputLayout


class LoginFragment : Fragment() {
    private lateinit var emailTIL: TextInputLayout
    private lateinit var passwordTIL: TextInputLayout
    private lateinit var emailET: EditText
    private lateinit var passwordET: EditText
    private lateinit var backgroundLayer: ImageView
    private lateinit var loginBTN: Button
    private lateinit var createAccountTV: TextView
    private lateinit var skipTV: TextView

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false).apply {
            emailTIL = findViewById(R.id.email_til)
            passwordTIL = findViewById(R.id.password_til)
            emailET = findViewById(R.id.email_et)
            passwordET = findViewById(R.id.password_et)
            loginBTN = findViewById(R.id.login_btn)
            createAccountTV = findViewById(R.id.create_account_btn)
            skipTV = findViewById(R.id.skip_btn)
            backgroundLayer = findViewById(R.id.background_layer_iv)
            backgroundLayer.setOnClickListener {
                if(passwordET.isFocused){
                    passwordET.onEditorAction(EditorInfo.IME_ACTION_DONE)
                } else if(emailET.isFocused){
                    emailET.onEditorAction(EditorInfo.IME_ACTION_DONE)
                }
            }
            loginBTN.setOnClickListener {

            }
            createAccountTV.setOnClickListener {

            }
            skipTV.setOnClickListener {

            }
        }
    }
}