package com.seeeeshtheearth.app.modules.verification.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class VerificationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOneOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtABCTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ghi)

)
