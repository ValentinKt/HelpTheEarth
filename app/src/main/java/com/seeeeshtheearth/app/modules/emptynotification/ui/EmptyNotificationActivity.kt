package com.seeeeshtheearth.app.modules.emptynotification.ui

import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityEmptyNotificationBinding
import com.seeeeshtheearth.app.modules.emptynotification.`data`.viewmodel.EmptyNotificationVM
import kotlin.String
import kotlin.Unit

class EmptyNotificationActivity :
    BaseActivity<ActivityEmptyNotificationBinding>(R.layout.activity_empty_notification) {
  private val viewModel: EmptyNotificationVM by viewModels<EmptyNotificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.emptyNotificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EMPTY_NOTIFICATION_ACTIVITY"

  }
}
