package com.deanthonee.shopapp.screens.shoppingcart

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deanthonee.shopapp.R

class ShoppingCartActivity : AppCompatActivity() {

    companion object {

        fun newIntent(context: Context) = Intent(context,ShoppingCartActivity.javaClass)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_cart)
    }
}
