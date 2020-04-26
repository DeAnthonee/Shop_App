package com.deanthonee.shopapp.screens.details

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deanthonee.shopapp.R

class DetailsActivity : AppCompatActivity() {

    companion object {

        fun newIntent(context: Context) = Intent(context,DetailsActivity.javaClass)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }
}
