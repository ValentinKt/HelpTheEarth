package com.seeeeshtheearth.app.modules.onboardingone.ui

import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityOnboardingOneBinding
import com.seeeeshtheearth.app.modules.onboardingone.`data`.viewmodel.OnboardingOneVM
import kotlin.String
import kotlin.Unit

class OnboardingOneActivity :
    BaseActivity<ActivityOnboardingOneBinding>(R.layout.activity_onboarding_one) {
  private val viewModel: OnboardingOneVM by viewModels<OnboardingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_ONE_ACTIVITY"

  }
}
