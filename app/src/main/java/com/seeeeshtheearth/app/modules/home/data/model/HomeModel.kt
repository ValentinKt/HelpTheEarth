package com.seeeeshtheearth.app.modules.home.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDhakaBanglade: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_yourk_usa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilters: String? = MyApp.getInstance().resources.getString(R.string.lbl_filters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSports: String? = MyApp.getInstance().resources.getString(R.string.lbl_sports)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMusicOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_upcoming_events)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllCopy: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInternationalG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_invite_your_fri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_get_20_for_tic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_nearby_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllCopyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_1st_may_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoShTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_women_s_leaders)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt24minOne: String? = MyApp.getInstance().resources.getString(R.string.msg_radius_gallery2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup33324: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_1st_may_sat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoShThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_international_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt24minTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_radius_gallery2)

)
