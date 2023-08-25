package com.seeeeshtheearth.app.modules.organizerprofileabout1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.seeeeshtheearth.app.modules.organizerprofileabout1.`data`.model.OrganizerProfileAbout1Model
import org.koin.core.KoinComponent

class OrganizerProfileAbout1VM : ViewModel(), KoinComponent {
  val organizerProfileAbout1Model: MutableLiveData<OrganizerProfileAbout1Model> =
      MutableLiveData(OrganizerProfileAbout1Model())

  var navArguments: Bundle? = null
}
