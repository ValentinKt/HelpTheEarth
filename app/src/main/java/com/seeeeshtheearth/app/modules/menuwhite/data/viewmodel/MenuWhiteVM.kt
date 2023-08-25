package com.seeeeshtheearth.app.modules.menuwhite.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.menuwhite.`data`.model.MenuWhiteModel
import org.koin.core.KoinComponent

class MenuWhiteVM : ViewModel(), KoinComponent {
  val menuWhiteModel: MutableLiveData<MenuWhiteModel> = MutableLiveData(MenuWhiteModel())

  var navArguments: Bundle? = null
}
