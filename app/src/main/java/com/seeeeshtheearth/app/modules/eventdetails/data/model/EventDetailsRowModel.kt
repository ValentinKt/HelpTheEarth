package com.seeeeshtheearth.app.modules.eventdetails.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class EventDetailsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBeliever: String? = MyApp.getInstance().resources.getString(R.string.msg_14_december_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_tuesday_4_00pm)

)
