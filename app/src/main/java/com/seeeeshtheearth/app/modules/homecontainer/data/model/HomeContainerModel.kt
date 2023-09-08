package com.seeeeshtheearth.app.modules.homecontainer.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class HomeContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEvents: String? = MyApp.getInstance().resources.getString(R.string.lbl_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMapTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_map)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_prfile)

)
