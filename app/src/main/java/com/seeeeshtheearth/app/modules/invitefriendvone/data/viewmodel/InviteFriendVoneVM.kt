package com.seeeeshtheearth.app.modules.invitefriendvone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.invitefriendvone.`data`.model.InviteFriendVoneModel
import com.seeeeshtheearth.app.modules.invitefriendvone.`data`.model.ListellipsefiftyeightRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class InviteFriendVoneVM : ViewModel(), KoinComponent {
  val inviteFriendVoneModel: MutableLiveData<InviteFriendVoneModel> =
      MutableLiveData(InviteFriendVoneModel())

  var navArguments: Bundle? = null

  val listellipsefiftyeightList: MutableLiveData<MutableList<ListellipsefiftyeightRowModel>> =
      MutableLiveData(mutableListOf())
}
