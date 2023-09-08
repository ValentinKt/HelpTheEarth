package com.seeeeshtheearth.app.modules.organizerprofileabout1.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class OrganizerProfileAbout1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_david_silbia)
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
  var txtD: String? = MyApp.getInstance().resources.getString(R.string.lbl_follow)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_massages)

)
