package com.seeeeshtheearth.app.modules.eventdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.eventdetails.`data`.model.EventDetailsModel
import com.seeeeshtheearth.app.modules.eventdetails.`data`.model.EventDetailsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EventDetailsVM : ViewModel(), KoinComponent {
  val eventDetailsModel: MutableLiveData<EventDetailsModel> = MutableLiveData(EventDetailsModel())

  var navArguments: Bundle? = null

  val eventDetailsList: MutableLiveData<MutableList<EventDetailsRowModel>> =
      MutableLiveData(mutableListOf())
}
