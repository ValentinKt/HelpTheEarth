package com.seeeeshtheearth.app.modules.seeallevents.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.seeallevents.`data`.model.SeeAllEventsModel
import com.seeeeshtheearth.app.modules.seeallevents.`data`.model.SeeAllEventsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SeeAllEventsVM : ViewModel(), KoinComponent {
  val seeAllEventsModel: MutableLiveData<SeeAllEventsModel> = MutableLiveData(SeeAllEventsModel())

  var navArguments: Bundle? = null

  val seeAllEventsList: MutableLiveData<MutableList<SeeAllEventsRowModel>> =
      MutableLiveData(mutableListOf())
}
