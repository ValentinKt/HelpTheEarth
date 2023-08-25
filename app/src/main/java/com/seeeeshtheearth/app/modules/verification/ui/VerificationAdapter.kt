package com.seeeeshtheearth.app.modules.verification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.databinding.RowVerificationBinding
import com.seeeeshtheearth.app.modules.verification.`data`.model.VerificationRowModel
import kotlin.Int
import kotlin.collections.List

class VerificationAdapter(
  var list: List<VerificationRowModel>
) : RecyclerView.Adapter<VerificationAdapter.RowVerificationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowVerificationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_verification,parent,false)
    return RowVerificationVH(view)
  }

  override fun onBindViewHolder(holder: RowVerificationVH, position: Int) {
    val verificationRowModel = VerificationRowModel()
    // TODO uncomment following line after integration with data source
    // val verificationRowModel = list[position]
    holder.binding.verificationRowModel = verificationRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<VerificationRowModel>) {
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
      item: VerificationRowModel
    ) {
    }
  }

  inner class RowVerificationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowVerificationBinding = RowVerificationBinding.bind(itemView)
  }
}
