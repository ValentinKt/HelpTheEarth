package com.seeeeshtheearth.app.modules.mapview.ui

import android.view.View
import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityMapViewBinding
import com.seeeeshtheearth.app.modules.mapview.`data`.model.MapViewRowModel
import com.seeeeshtheearth.app.modules.mapview.`data`.viewmodel.MapViewVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MapViewActivity : BaseActivity<ActivityMapViewBinding>(R.layout.activity_map_view) {
  private val viewModel: MapViewVM by viewModels<MapViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val mapViewAdapter = MapViewAdapter(viewModel.mapViewList.value?:mutableListOf())
    binding.recyclerMapView.adapter = mapViewAdapter
    mapViewAdapter.setOnItemClickListener(
    object : MapViewAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MapViewRowModel) {
        onClickRecyclerMapView(view, position, item)
      }
    }
    )
    viewModel.mapViewList.observe(this) {
      mapViewAdapter.updateData(it)
    }
    binding.mapViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMapView(
    view: View,
    position: Int,
    item: MapViewRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MAP_VIEW_ACTIVITY"

  }
}
