package com.seeeeshtheearth.app.modules.ressetpassword.ui

import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityRessetPasswordBinding
import com.seeeeshtheearth.app.modules.ressetpassword.`data`.viewmodel.RessetPasswordVM
import kotlin.String
import kotlin.Unit

class RessetPasswordActivity :
    BaseActivity<ActivityRessetPasswordBinding>(R.layout.activity_resset_password) {
  private val viewModel: RessetPasswordVM by viewModels<RessetPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ressetPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "RESSET_PASSWORD_ACTIVITY"

  }
}
