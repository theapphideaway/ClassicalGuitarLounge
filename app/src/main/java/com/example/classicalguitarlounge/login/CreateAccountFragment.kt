package com.example.classicalguitarlounge.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.classicalguitarlounge.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class CreateAccountFragment : BottomSheetDialogFragment() {

    private lateinit var cancelTV: TextView
    private lateinit var createAccountBTN: Button

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_create_account, container, false).apply{
            cancelTV = findViewById(R.id.cancel_btn)
            createAccountBTN = findViewById(R.id.finish_create_account_btn)
            cancelTV.setOnClickListener {
                this@CreateAccountFragment.dismiss()
            }
        }
    }
}