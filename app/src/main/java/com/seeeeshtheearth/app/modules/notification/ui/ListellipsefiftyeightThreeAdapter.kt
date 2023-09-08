package com.seeeeshtheearth.app.modules.notification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowListellipsefiftyeightThreeBinding
import com.seeeeshtheearth.app.modules.notification.`data`.model.ListellipsefiftyeightThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsefiftyeightThreeAdapter(
  var list: List<ListellipsefiftyeightThreeRowModel>
) : RecyclerView.Adapter<ListellipsefiftyeightThreeAdapter.RowListellipsefiftyeightThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListellipsefiftyeightThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsefiftyeight_three,parent,false)
    return RowListellipsefiftyeightThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsefiftyeightThreeVH, position: Int) {
    val listellipsefiftyeightThreeRowModel = ListellipsefiftyeightThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsefiftyeightThreeRowModel = list[position]
    holder.binding.listellipsefiftyeightThreeRowModel = listellipsefiftyeightThreeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsefiftyeightThreeRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListellipsefiftyeightThreeRowModel
    ) {
    }
  }

  inner class RowListellipsefiftyeightThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsefiftyeightThreeBinding =
        RowListellipsefiftyeightThreeBinding.bind(itemView)
  }
}
