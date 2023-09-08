package com.seeeeshtheearth.app.modules.mapview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.mapview.`data`.model.MapViewModel
import com.seeeeshtheearth.app.modules.mapview.`data`.model.MapViewRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MapViewVM : ViewModel(), KoinComponent {
  val mapViewModel: MutableLiveData<MapViewModel> = MutableLiveData(MapViewModel())

  var navArguments: Bundle? = null

  val mapViewList: MutableLiveData<MutableList<MapViewRowModel>> = MutableLiveData(mutableListOf())
}
