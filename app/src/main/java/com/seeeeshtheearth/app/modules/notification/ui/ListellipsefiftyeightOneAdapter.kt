package com.seeeeshtheearth.app.modules.notification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowListellipsefiftyeightOneBinding
import com.seeeeshtheearth.app.modules.notification.`data`.model.ListellipsefiftyeightOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsefiftyeightOneAdapter(
  var list: List<ListellipsefiftyeightOneRowModel>
) : RecyclerView.Adapter<ListellipsefiftyeightOneAdapter.RowListellipsefiftyeightOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsefiftyeightOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsefiftyeight_one,parent,false)
    return RowListellipsefiftyeightOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsefiftyeightOneVH, position: Int) {
    val listellipsefiftyeightOneRowModel = ListellipsefiftyeightOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsefiftyeightOneRowModel = list[position]
    holder.binding.listellipsefiftyeightOneRowModel = listellipsefiftyeightOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsefiftyeightOneRowModel>) {
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
      item: ListellipsefiftyeightOneRowModel
    ) {
    }
  }

  inner class RowListellipsefiftyeightOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsefiftyeightOneBinding =
        RowListellipsefiftyeightOneBinding.bind(itemView)
  }
}
