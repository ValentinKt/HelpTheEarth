package com.seeeeshtheearth.app.modules.eventdetails.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class EventDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAshfak: String? = MyApp.getInstance().resources.getString(R.string.lbl_event_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt20Going: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_going)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInternationalB: String? =
      MyApp.getInstance().resources.getString(R.string.msg_international_b2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBest15rock: String? = MyApp.getInstance().resources.getString(R.string.lbl_ashfak_sayem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNowPlaying: String? = MyApp.getInstance().resources.getString(R.string.lbl_organizer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_event)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_your_favo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_buy_ticket_120)

)
