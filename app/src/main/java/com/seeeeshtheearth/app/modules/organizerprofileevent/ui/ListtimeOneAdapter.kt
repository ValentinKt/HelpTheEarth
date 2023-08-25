package com.seeeeshtheearth.app.modules.organizerprofileevent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowListtimeOne1Binding
import com.seeeeshtheearth.app.modules.organizerprofileevent.`data`.model.ListtimeOne1RowModel
import kotlin.Int
import kotlin.collections.List

class ListtimeOneAdapter(
  var list: List<ListtimeOne1RowModel>
) : RecyclerView.Adapter<ListtimeOneAdapter.RowListtimeOne1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtimeOne1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtime_one1,parent,false)
    return RowListtimeOne1VH(view)
  }

  override fun onBindViewHolder(holder: RowListtimeOne1VH, position: Int) {
    val listtimeOne1RowModel = ListtimeOne1RowModel()
    // TODO uncomment following line after integration with data source
    // val listtimeOne1RowModel = list[position]
    holder.binding.listtimeOne1RowModel = listtimeOne1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtimeOne1RowModel>) {
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
      item: ListtimeOne1RowModel
    ) {
    }
  }

  inner class RowListtimeOne1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtimeOne1Binding = RowListtimeOne1Binding.bind(itemView)
  }
}
