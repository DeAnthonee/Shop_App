package com.deanthonee.shopapp.screens.account

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deanthonee.shopapp.R

class AccountActivity : AppCompatActivity() {

    companion object {

        fun newIntent(context: Context) = Intent(context,AccountActivity::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
    }
}
