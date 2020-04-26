package com.deanthonee.shopapp.screens.rewards

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deanthonee.shopapp.R

class RewardsActivity : AppCompatActivity() {

    companion object {

        fun newIntent(context: Context) = Intent(context,RewardsActivity.javaClass)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rewards)
    }
}
