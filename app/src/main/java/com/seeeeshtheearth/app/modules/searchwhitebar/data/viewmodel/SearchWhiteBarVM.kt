package com.seeeeshtheearth.app.modules.searchwhitebar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.searchwhitebar.`data`.model.ListtimeOneRowModel
import com.seeeeshtheearth.app.modules.searchwhitebar.`data`.model.SearchWhiteBarModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchWhiteBarVM : ViewModel(), KoinComponent {
  val searchWhiteBarModel: MutableLiveData<SearchWhiteBarModel> =
      MutableLiveData(SearchWhiteBarModel())

  var navArguments: Bundle? = null

  val listtimeOneList: MutableLiveData<MutableList<ListtimeOneRowModel>> =
      MutableLiveData(mutableListOf())
}
