package com.seeeeshtheearth.app.modules.mapview.`data`.model

import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import kotlin.String

data class MapViewRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_wed_apr_28_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImGoingtoSh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jo_malone_londo2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt24min: String? = MyApp.getInstance().resources.getString(R.string.msg_radius_gallery)

)
