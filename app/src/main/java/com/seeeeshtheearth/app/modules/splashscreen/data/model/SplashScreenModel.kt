package com.seeeeshtheearth.app.modules.splashscreen.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVentHub: String? = MyApp.getInstance().resources.getString(R.string.lbl_venthub)

)
