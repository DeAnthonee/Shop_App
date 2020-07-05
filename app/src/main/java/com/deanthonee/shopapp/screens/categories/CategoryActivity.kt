package com.deanthonee.shopapp.screens.categories

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.deanthonee.shopapp.R
import com.deanthonee.shopapp.databinding.ActivityCategoryBinding
import com.deanthonee.shopapp.models.Product

class CategoryActivity : AppCompatActivity() {

    lateinit var bindings: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_category)

        initRcv()
    }

    private fun initRcv() {
        val list = fakeList()
        val aadapter = ProductAdapter(list)
        Log.d("milo", "Rcv is ${list.toString()}")
        val viewManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        bindings.categoryRcv.layoutManager = viewManager
        bindings.categoryRcv.adapter = aadapter
        bindings.categoryRcv.setHasFixedSize(true)
    }

    private fun fakeList(): List<Product> {
        val product1 =
            Product(name = "Product 1", price = "$35", brand = "Top Brand", category = "Vapes", imageUrl = "urlstring")
        val product2 =
            Product(name = "Product 2", price = "$45", brand = "Top Brand", category = "Vapes", imageUrl = "urlstring")
        val product3 =
            Product(name = "Product 3", price = "$30", brand = "Top Brand", category = "Vapes", imageUrl = "urlstring")
        val product4 =
            Product(name = "Product 4", price = "$55", brand = "Top Brand", category = "Vapes", imageUrl = "urlstring")
        val product5 =
            Product(name = "Product 5", price = "$25", brand = "Top Brand", category = "Vapes", imageUrl = "urlstring")
        val product6 =
            Product(name = "Product 6", price = "$60", brand = "Top Brand", category = "Vapes", imageUrl = "urlstring")
        val product7 =
            Product(name = "Product 7", price = "$75", brand = "Top Brand", category = "Vapes", imageUrl = "urlstring")
        return listOf(
            product1,
            product2,
            product3,
            product4,
            product5,
            product6,
            product7,
            product1,
            product2,
            product3,
            product4,
            product5,
            product6,
            product7,
            product1,
            product2,
            product3,
            product4,
            product5,
            product6,
            product7
        )
    }

    companion object {

        fun newIntent(context: Context) = Intent(context, CategoryActivity::class.java)
    }
}
