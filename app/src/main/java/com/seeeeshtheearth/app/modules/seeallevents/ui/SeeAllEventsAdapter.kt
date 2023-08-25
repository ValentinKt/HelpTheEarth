package com.seeeeshtheearth.app.modules.seeallevents.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowSeeAllEventsBinding
import com.seeeeshtheearth.app.modules.seeallevents.`data`.model.SeeAllEventsRowModel
import kotlin.Int
import kotlin.collections.List

class SeeAllEventsAdapter(
  var list: List<SeeAllEventsRowModel>
) : RecyclerView.Adapter<SeeAllEventsAdapter.RowSeeAllEventsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSeeAllEventsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_see_all_events,parent,false)
    return RowSeeAllEventsVH(view)
  }

  override fun onBindViewHolder(holder: RowSeeAllEventsVH, position: Int) {
    val seeAllEventsRowModel = SeeAllEventsRowModel()
    // TODO uncomment following line after integration with data source
    // val seeAllEventsRowModel = list[position]
    holder.binding.seeAllEventsRowModel = seeAllEventsRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SeeAllEventsRowModel>) {
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
      item: SeeAllEventsRowModel
    ) {
    }
  }

  inner class RowSeeAllEventsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSeeAllEventsBinding = RowSeeAllEventsBinding.bind(itemView)
  }
}
