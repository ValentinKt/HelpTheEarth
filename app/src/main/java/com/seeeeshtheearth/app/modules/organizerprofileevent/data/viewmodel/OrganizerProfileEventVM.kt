package com.seeeeshtheearth.app.modules.organizerprofileevent.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.organizerprofileevent.`data`.model.ListtimeOne1RowModel
import com.seeeeshtheearth.app.modules.organizerprofileevent.`data`.model.OrganizerProfileEventModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrganizerProfileEventVM : ViewModel(), KoinComponent {
  val organizerProfileEventModel: MutableLiveData<OrganizerProfileEventModel> =
      MutableLiveData(OrganizerProfileEventModel())

  var navArguments: Bundle? = null

  val listtimeOneList: MutableLiveData<MutableList<ListtimeOne1RowModel>> =
      MutableLiveData(mutableListOf())
}
