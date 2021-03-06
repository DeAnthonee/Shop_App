package com.deanthonee.shopapp.screens.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.deanthonee.shopapp.R
import com.deanthonee.shopapp.models.Product
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

        fun newIntent(context: Context) = Intent(context, HomeActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initOnClicks()
    }

    private fun initOnClicks() {
        //Fake Product
        val product = Product(
            name = "Girl Scout Cookies",
            price = "$40.00",
            brand = "Good Ones",
            category = "Flower",
            imageUrl = "FakeimageUrl.com"
        )
        item_details_button.setOnClickListener {
            startActivity(DetailsActivity.newIntent(this, product))
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
