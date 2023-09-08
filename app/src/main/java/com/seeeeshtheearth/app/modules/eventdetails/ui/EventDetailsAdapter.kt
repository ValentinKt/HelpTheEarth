package com.seeeeshtheearth.app.modules.eventdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowEventDetailsBinding
import com.seeeeshtheearth.app.modules.eventdetails.`data`.model.EventDetailsRowModel
import kotlin.Int
import kotlin.collections.List

class EventDetailsAdapter(
  var list: List<EventDetailsRowModel>
) : RecyclerView.Adapter<EventDetailsAdapter.RowEventDetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEventDetailsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_event_details,parent,false)
    return RowEventDetailsVH(view)
  }

  override fun onBindViewHolder(holder: RowEventDetailsVH, position: Int) {
    val eventDetailsRowModel = EventDetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val eventDetailsRowModel = list[position]
    holder.binding.eventDetailsRowModel = eventDetailsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EventDetailsRowModel>) {
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
      item: EventDetailsRowModel
    ) {
    }
  }

  inner class RowEventDetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEventDetailsBinding = RowEventDetailsBinding.bind(itemView)
  }
}
