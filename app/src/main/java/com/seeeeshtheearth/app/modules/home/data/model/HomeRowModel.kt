package com.seeeeshtheearth.app.modules.home.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class HomeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArmanrokni: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_june)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_international_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt20Going: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_going)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_36_guild_street)

)
