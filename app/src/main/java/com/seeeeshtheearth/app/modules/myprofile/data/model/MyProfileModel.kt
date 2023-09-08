package com.seeeeshtheearth.app.modules.myprofile.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAshfak: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMohammadreza: String? = MyApp.getInstance().resources.getString(R.string.lbl_ashfak_sayem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt6105: String? = MyApp.getInstance().resources.getString(R.string.lbl_350)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalcalories: String? = MyApp.getInstance().resources.getString(R.string.lbl_following)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt346copy: String? = MyApp.getInstance().resources.getString(R.string.lbl_346)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowers: String? = MyApp.getInstance().resources.getString(R.string.lbl_followers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtD: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopular: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_your_favo3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvailableforh: String? = MyApp.getInstance().resources.getString(R.string.lbl_interest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnLive: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame18781: String? = MyApp.getInstance().resources.getString(R.string.lbl_games_online)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame18782: String? = MyApp.getInstance().resources.getString(R.string.lbl_concert)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame18783: String? = MyApp.getInstance().resources.getString(R.string.lbl_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame18785: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)

)
