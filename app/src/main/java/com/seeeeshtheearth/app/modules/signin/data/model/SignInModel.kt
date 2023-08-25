package com.seeeeshtheearth.app.modules.signin.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEventHub: String? = MyApp.getInstance().resources.getString(R.string.lbl_eventhub)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRememberMe: String? = MyApp.getInstance().resources.getString(R.string.lbl_remember_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithGoog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_goog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginwithFace: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_with_face)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null
)
