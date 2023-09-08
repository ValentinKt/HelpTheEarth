package com.seeeeshtheearth.app.modules.organizerprofilereview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowListellipsefiftytwoBinding
import com.seeeeshtheearth.app.modules.organizerprofilereview.`data`.model.ListellipsefiftytwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsefiftytwoAdapter(
  var list: List<ListellipsefiftytwoRowModel>
) : RecyclerView.Adapter<ListellipsefiftytwoAdapter.RowListellipsefiftytwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsefiftytwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsefiftytwo,parent,false)
    return RowListellipsefiftytwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsefiftytwoVH, position: Int) {
    val listellipsefiftytwoRowModel = ListellipsefiftytwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsefiftytwoRowModel = list[position]
    holder.binding.listellipsefiftytwoRowModel = listellipsefiftytwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsefiftytwoRowModel>) {
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
      item: ListellipsefiftytwoRowModel
    ) {
    }
  }

  inner class RowListellipsefiftytwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsefiftytwoBinding = RowListellipsefiftytwoBinding.bind(itemView)
  }
}
