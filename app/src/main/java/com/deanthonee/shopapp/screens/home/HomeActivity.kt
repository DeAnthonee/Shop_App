package com.deanthonee.shopapp.screens.home

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deanthonee.shopapp.R
import com.deanthonee.shopapp.screens.account.AccountActivity
import com.deanthonee.shopapp.screens.categories.CategoryActivity
import com.deanthonee.shopapp.screens.deals.DealsActivity
import com.deanthonee.shopapp.screens.details.DetailsActivity
import com.deanthonee.shopapp.screens.rewards.RewardsActivity
import com.deanthonee.shopapp.screens.shoppingcart.ShoppingCartActivity
import kotlinx.android.synthetic.main.activity_home.account_button
import kotlinx.android.synthetic.main.activity_home.category_button
import kotlinx.android.synthetic.main.activity_home.item_details_button
import kotlinx.android.synthetic.main.activity_home.rewards_button
import kotlinx.android.synthetic.main.activity_home.shopping_cart_button
import kotlinx.android.synthetic.main.activity_home.special_button

class HomeActivity : AppCompatActivity() {

    companion object {

        fun newIntent(context: Context) = Intent(context,HomeActivity.javaClass)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initOnClicks()
    }

    private fun initOnClicks() {
         item_details_button.setOnClickListener {
             startActivity(DetailsActivity.newIntent(this))
         }
        shopping_cart_button.setOnClickListener {
            startActivity(ShoppingCartActivity.newIntent(this))
        }
        account_button.setOnClickListener {
            startActivity(AccountActivity.newIntent(this))
        }
        special_button.setOnClickListener {
            startActivity(DealsActivity.newIntent(this))
        }
        rewards_button.setOnClickListener {
            startActivity(RewardsActivity.newIntent(this))
        }
        category_button.setOnClickListener {
            startActivity(CategoryActivity.newIntent(this))
        }
    }
}
