package com.seeeeshtheearth.app.modules.invitefriendvone.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class InviteFriendVoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInviteFriend: String? = MyApp.getInstance().resources.getString(R.string.lbl_invite_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJhonWick: String? = MyApp.getInstance().resources.getString(R.string.lbl_jhon_wick)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2kFollwersOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2k_follwers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZeniferoBolex: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_zenifero_bolex)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3kFollwers: String? = MyApp.getInstance().resources.getString(R.string.lbl_3k_follwers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_invite)
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
  var txtLanguageThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_36_guild_street2)

)
