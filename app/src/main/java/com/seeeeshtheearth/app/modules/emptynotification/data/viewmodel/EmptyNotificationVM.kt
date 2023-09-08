package com.seeeeshtheearth.app.modules.emptynotification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.emptynotification.`data`.model.EmptyNotificationModel
import org.koin.core.KoinComponent

class EmptyNotificationVM : ViewModel(), KoinComponent {
  val emptyNotificationModel: MutableLiveData<EmptyNotificationModel> =
      MutableLiveData(EmptyNotificationModel())

  var navArguments: Bundle? = null
}
