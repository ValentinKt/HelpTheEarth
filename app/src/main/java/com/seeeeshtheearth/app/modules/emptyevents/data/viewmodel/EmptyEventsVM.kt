package com.seeeeshtheearth.app.modules.emptyevents.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.emptyevents.`data`.model.EmptyEventsModel
import org.koin.core.KoinComponent

class EmptyEventsVM : ViewModel(), KoinComponent {
  val emptyEventsModel: MutableLiveData<EmptyEventsModel> = MutableLiveData(EmptyEventsModel())

  var navArguments: Bundle? = null
}
