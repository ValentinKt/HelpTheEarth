package com.seeeeshtheearth.app.modules.notification.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAshfak: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_david_silbia_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJustnow: String? = MyApp.getInstance().resources.getString(R.string.lbl_just_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEricGPricket: String? =
      MyApp.getInstance().resources.getString(R.string.msg_eric_g_pricket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_wed_3_30_pm)

)
