package com.seeeeshtheearth.app.modules.notification.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsefiftyeightThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRonaldCKinch: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ronald_c_kinch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1hrago: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hr_ago)

)
