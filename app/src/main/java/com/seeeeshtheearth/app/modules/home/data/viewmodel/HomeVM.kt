package com.seeeeshtheearth.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.home.`data`.model.HomeModel
import com.seeeeshtheearth.app.modules.home.`data`.model.HomeRowModel
import com.seeeeshtheearth.app.modules.home.`data`.model.SpinnerGroupTenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  val spinnerGroupTenList: MutableLiveData<MutableList<SpinnerGroupTenModel>> = MutableLiveData()

  val homeList: MutableLiveData<MutableList<HomeRowModel>> = MutableLiveData(mutableListOf())
}
