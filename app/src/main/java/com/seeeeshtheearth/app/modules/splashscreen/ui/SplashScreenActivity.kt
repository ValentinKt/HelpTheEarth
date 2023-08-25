package com.seeeeshtheearth.app.modules.splashscreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivitySplashScreenBinding
import com.seeeeshtheearth.app.modules.homecontainer.ui.HomeContainerActivity
import com.seeeeshtheearth.app.modules.splashscreen.`data`.viewmodel.SplashScreenVM
import kotlin.String
import kotlin.Unit

class SplashScreenActivity :
    BaseActivity<ActivitySplashScreenBinding>(R.layout.activity_splash_screen) {
  private val viewModel: SplashScreenVM by viewModels<SplashScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = HomeContainerActivity.getIntent(this, null)
      startActivity(destIntent)
      this.overridePendingTransition(R.anim.fade_in ,R.anim.fade_out )
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPLASH_SCREEN_ACTIVITY"

    }
  }
