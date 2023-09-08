package com.seeeeshtheearth.app.modules.menuwhite.ui

import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityMenuWhiteBinding
import com.seeeeshtheearth.app.modules.menuwhite.`data`.viewmodel.MenuWhiteVM
import kotlin.String
import kotlin.Unit

class MenuWhiteActivity : BaseActivity<ActivityMenuWhiteBinding>(R.layout.activity_menu_white) {
  private val viewModel: MenuWhiteVM by viewModels<MenuWhiteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuWhiteVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_WHITE_ACTIVITY"

  }
}
