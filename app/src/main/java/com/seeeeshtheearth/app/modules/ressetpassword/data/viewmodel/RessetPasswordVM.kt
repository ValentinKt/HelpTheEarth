package com.seeeeshtheearth.app.modules.ressetpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.ressetpassword.`data`.model.RessetPasswordModel
import org.koin.core.KoinComponent

class RessetPasswordVM : ViewModel(), KoinComponent {
  val ressetPasswordModel: MutableLiveData<RessetPasswordModel> =
      MutableLiveData(RessetPasswordModel())

  var navArguments: Bundle? = null
}
