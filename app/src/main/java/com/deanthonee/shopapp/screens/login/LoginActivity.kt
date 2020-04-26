package com.deanthonee.shopapp.screens.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deanthonee.shopapp.R
import com.deanthonee.shopapp.screens.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.login_button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_button.setOnClickListener {
            startActivity(HomeActivity.newIntent(this))
        }
    }
}
