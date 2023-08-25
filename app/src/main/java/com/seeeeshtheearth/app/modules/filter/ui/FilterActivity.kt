package com.seeeeshtheearth.app.modules.filter.ui

import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.appcomponents.views.ImagePickerFragmentDialog
import com.seeeeshtheearth.app.databinding.ActivityFilterBinding
import com.seeeeshtheearth.app.modules.filter.`data`.viewmodel.FilterVM
import kotlin.String
import kotlin.Unit

class FilterActivity : BaseActivity<ActivityFilterBinding>(R.layout.activity_filter) {
  private val viewModel: FilterVM by viewModels<FilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.filterVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
  }

  companion object {
    const val TAG: String = "FILTER_ACTIVITY"

  }
}
