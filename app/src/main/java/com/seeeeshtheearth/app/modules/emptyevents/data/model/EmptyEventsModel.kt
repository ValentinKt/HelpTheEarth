package com.seeeeshtheearth.app.modules.emptyevents.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class EmptyEventsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAshfak: String? = MyApp.getInstance().resources.getString(R.string.lbl_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowing: String? = MyApp.getInstance().resources.getString(R.string.lbl_past_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_no_upcoming_eve)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore_events)

)
