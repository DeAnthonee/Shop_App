package com.deanthonee.shopapp.screens.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.deanthonee.shopapp.R
import com.deanthonee.shopapp.models.Product
import kotlinx.android.synthetic.main.activity_details.details_brand_textview
import kotlinx.android.synthetic.main.activity_details.details_category_textview
import kotlinx.android.synthetic.main.activity_details.details_price_textview

class DetailsActivity : AppCompatActivity() {

    companion object {
        const val PRODUCT_KEY = "product_key"

        fun newIntent(context: Context, product: Product): Intent {
            val intent: Intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra(PRODUCT_KEY, product)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val product = intent.getParcelableExtra<Product>(PRODUCT_KEY)
        details_brand_textview.text = product?.brand
        details_category_textview.text = product?.category
        details_price_textview.text = product?.price
        title = product.name
    }
}
