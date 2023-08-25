package com.seeeeshtheearth.app.modules.organizerprofileabout.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.organizerprofileabout.`data`.model.OrganizerProfileAboutModel
import org.koin.core.KoinComponent

class OrganizerProfileAboutVM : ViewModel(), KoinComponent {
  val organizerProfileAboutModel: MutableLiveData<OrganizerProfileAboutModel> =
      MutableLiveData(OrganizerProfileAboutModel())

  var navArguments: Bundle? = null
}
