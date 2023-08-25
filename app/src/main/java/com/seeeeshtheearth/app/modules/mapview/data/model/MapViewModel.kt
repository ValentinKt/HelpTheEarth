package com.seeeeshtheearth.app.modules.mapview.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class MapViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSports: String? = MyApp.getInstance().resources.getString(R.string.lbl_sports)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSportsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSportsTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSportsThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup18499Value: String? = null
)
