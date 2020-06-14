package com.deanthonee.shopapp.screens.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deanthonee.shopapp.R
import com.deanthonee.shopapp.databinding.ActivityLoginBinding
import com.deanthonee.shopapp.screens.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.login_button

class LoginActivity : AppCompatActivity() {

    lateinit var bindings:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(bindings.root)

        bindings.loginButton.setOnClickListener {
            startActivity(HomeActivity.newIntent(this))
        }
    }
}
