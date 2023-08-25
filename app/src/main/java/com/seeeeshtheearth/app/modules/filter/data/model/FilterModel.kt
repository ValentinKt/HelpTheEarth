package com.seeeeshtheearth.app.modules.filter.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class FilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_time_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup18326: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup18327: String? = MyApp.getInstance().resources.getString(R.string.lbl_tomorrow)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup18328: String? = MyApp.getInstance().resources.getString(R.string.lbl_this_week)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosefromcal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_from_cal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewYourkUSA: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_yourk_usa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectpricera: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_price_ra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_120)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilter: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter)
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
  var txtArt: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFoodOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_10_june_9_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_international_g2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_36_guild_street2)

)
