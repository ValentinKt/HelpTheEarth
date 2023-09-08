package com.seeeeshtheearth.app.modules.menuwhite.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class MenuWhiteModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAshfakSayem: String? = MyApp.getInstance().resources.getString(R.string.lbl_ashfak_sayem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMassage: String? = MyApp.getInstance().resources.getString(R.string.lbl_massage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalender: String? = MyApp.getInstance().resources.getString(R.string.lbl_calender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBookmarkOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_bookmark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactUs: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpsFAQs: String? = MyApp.getInstance().resources.getString(R.string.lbl_helps_faqs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignOut: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup17876Value: String? = null
)
