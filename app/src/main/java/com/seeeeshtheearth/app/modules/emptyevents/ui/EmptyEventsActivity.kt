package com.seeeeshtheearth.app.modules.emptyevents.ui

import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityEmptyEventsBinding
import com.seeeeshtheearth.app.modules.emptyevents.`data`.viewmodel.EmptyEventsVM
import kotlin.String
import kotlin.Unit

class EmptyEventsActivity : BaseActivity<ActivityEmptyEventsBinding>(R.layout.activity_empty_events)
    {
  private val viewModel: EmptyEventsVM by viewModels<EmptyEventsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.emptyEventsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EMPTY_EVENTS_ACTIVITY"

  }
}
