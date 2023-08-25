package com.seeeeshtheearth.app.modules.ressetpassword.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class RessetPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeGetsta: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_resset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseenteryo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_enter_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_send)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null
)
