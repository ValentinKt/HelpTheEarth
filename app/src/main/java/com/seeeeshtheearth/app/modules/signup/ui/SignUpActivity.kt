package com.seeeeshtheearth.app.modules.signup.ui

import android.content.Intent
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.appcomponents.facebookauth.FacebookHelper
import com.seeeeshtheearth.app.appcomponents.googleauth.GoogleHelper
import com.seeeeshtheearth.app.databinding.ActivitySignUpBinding
import com.seeeeshtheearth.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.linearRowfacebook.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.imageArrowleft.setOnClickListener {
          finish()
        }
      }

      companion object {
        const val TAG: String = "SIGN_UP_ACTIVITY"

      }
    }
