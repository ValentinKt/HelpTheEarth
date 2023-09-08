package com.seeeeshtheearth.app.modules.organizerprofileevent.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class OrganizerProfileEventModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_1st_may_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_virtual_eveni)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeFive: String? = MyApp.getInstance().resources.getString(R.string.msg_10_june_9_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoShFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_international_g2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_36_guild_street2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeSix: String? = MyApp.getInstance().resources.getString(R.string.msg_10_june_9_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoShFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_international_g2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_36_guild_street2)

)
