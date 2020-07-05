package com.deanthonee.shopapp.screens.categories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.deanthonee.shopapp.R
import com.deanthonee.shopapp.models.Product

class ProductAdapter(private val list: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_product_full_width, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bind(list[position])
    }

    class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var productNameTv: TextView
        var priceTv: TextView
        var brandTv: TextView
        var categoryTv: TextView
        var image: ImageView

        init {
            productNameTv = itemView.findViewById(R.id.list_item_wide_name_textview)
            priceTv = itemView.findViewById(R.id.list_item_wide_price_textview)
            brandTv = itemView.findViewById(R.id.list_item_wide_brand_textview)
            categoryTv = itemView.findViewById(R.id.list_item_wide_category_textview)
            image = itemView.findViewById(R.id.list_item_wide_image)
        }

        fun bind(product: Product) {
            productNameTv.text = product.name
            priceTv.text = product.price
            brandTv.text = product.brand
            categoryTv.text = product.category
            // Add image library
        }

    }
}