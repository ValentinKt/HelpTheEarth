package com.seeeeshtheearth.app.modules.notification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.notification.`data`.model.ListellipsefiftyeightOneRowModel
import com.seeeeshtheearth.app.modules.notification.`data`.model.ListellipsefiftyeightThreeRowModel
import com.seeeeshtheearth.app.modules.notification.`data`.model.NotificationModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationVM : ViewModel(), KoinComponent {
  val notificationModel: MutableLiveData<NotificationModel> = MutableLiveData(NotificationModel())

  var navArguments: Bundle? = null

  val listellipsefiftyeightOneList: MutableLiveData<MutableList<ListellipsefiftyeightOneRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipsefiftyeightThreeList:
      MutableLiveData<MutableList<ListellipsefiftyeightThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
