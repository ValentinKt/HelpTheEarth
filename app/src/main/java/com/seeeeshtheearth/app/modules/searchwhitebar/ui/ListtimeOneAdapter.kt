package com.seeeeshtheearth.app.modules.searchwhitebar.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowListtimeOneBinding
import com.seeeeshtheearth.app.modules.searchwhitebar.`data`.model.ListtimeOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListtimeOneAdapter(
  var list: List<ListtimeOneRowModel>
) : RecyclerView.Adapter<ListtimeOneAdapter.RowListtimeOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtimeOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtime_one,parent,false)
    return RowListtimeOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListtimeOneVH, position: Int) {
    val listtimeOneRowModel = ListtimeOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listtimeOneRowModel = list[position]
    holder.binding.listtimeOneRowModel = listtimeOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtimeOneRowModel>) {
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
      item: ListtimeOneRowModel
    ) {
    }
  }

  inner class RowListtimeOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtimeOneBinding = RowListtimeOneBinding.bind(itemView)
  }
}
