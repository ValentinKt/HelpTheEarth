package com.seeeeshtheearth.app.modules.organizerprofilereview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.organizerprofilereview.`data`.model.ListellipsefiftytwoRowModel
import com.seeeeshtheearth.app.modules.organizerprofilereview.`data`.model.OrganizerProfileReviewModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrganizerProfileReviewVM : ViewModel(), KoinComponent {
  val organizerProfileReviewModel: MutableLiveData<OrganizerProfileReviewModel> =
      MutableLiveData(OrganizerProfileReviewModel())

  var navArguments: Bundle? = null

  val listellipsefiftytwoList: MutableLiveData<MutableList<ListellipsefiftytwoRowModel>> =
      MutableLiveData(mutableListOf())
}
