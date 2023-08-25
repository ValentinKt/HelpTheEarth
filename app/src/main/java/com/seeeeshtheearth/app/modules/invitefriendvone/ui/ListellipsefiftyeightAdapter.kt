package com.seeeeshtheearth.app.modules.invitefriendvone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowListellipsefiftyeightBinding
import com.seeeeshtheearth.app.modules.invitefriendvone.`data`.model.ListellipsefiftyeightRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsefiftyeightAdapter(
  var list: List<ListellipsefiftyeightRowModel>
) : RecyclerView.Adapter<ListellipsefiftyeightAdapter.RowListellipsefiftyeightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsefiftyeightVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsefiftyeight,parent,false)
    return RowListellipsefiftyeightVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsefiftyeightVH, position: Int) {
    val listellipsefiftyeightRowModel = ListellipsefiftyeightRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsefiftyeightRowModel = list[position]
    holder.binding.listellipsefiftyeightRowModel = listellipsefiftyeightRowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsefiftyeightRowModel>) {
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
      item: ListellipsefiftyeightRowModel
    ) {
    }
  }

  inner class RowListellipsefiftyeightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsefiftyeightBinding = RowListellipsefiftyeightBinding.bind(itemView)
  }
}
