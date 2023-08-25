package com.seeeeshtheearth.app.modules.organizerprofilereview.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsefiftytwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRocksVelkeinje: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rocks_velkeinje)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFebCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_feb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCinemasisthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cinemas_is_the)

)
