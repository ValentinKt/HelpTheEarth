package com.seeeeshtheearth.app.modules.mapview.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowMapViewBinding
import com.seeeeshtheearth.app.modules.mapview.`data`.model.MapViewRowModel
import kotlin.Int
import kotlin.collections.List

class MapViewAdapter(
  var list: List<MapViewRowModel>
) : RecyclerView.Adapter<MapViewAdapter.RowMapViewVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMapViewVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_map_view,parent,false)
    return RowMapViewVH(view)
  }

  override fun onBindViewHolder(holder: RowMapViewVH, position: Int) {
    val mapViewRowModel = MapViewRowModel()
    // TODO uncomment following line after integration with data source
    // val mapViewRowModel = list[position]
    holder.binding.mapViewRowModel = mapViewRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MapViewRowModel>) {
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
      item: MapViewRowModel
    ) {
    }
  }

  inner class RowMapViewVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMapViewBinding = RowMapViewBinding.bind(itemView)
  }
}
