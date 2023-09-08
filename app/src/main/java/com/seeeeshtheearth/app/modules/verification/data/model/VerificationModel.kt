package com.seeeeshtheearth.app.modules.verification.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class VerificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeGetsta: String? = MyApp.getInstance().resources.getString(R.string.lbl_verification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWevesendyou: String? = MyApp.getInstance().resources.getString(R.string.msg_we_ve_send_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_re_send_code_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtABC: String? = MyApp.getInstance().resources.getString(R.string.lbl_abc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtABCOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_def)

)
