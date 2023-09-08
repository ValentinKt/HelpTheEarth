package com.seeeeshtheearth.app.modules.verification.ui

import android.content.Intent
import android.content.IntentFilter
import android.view.View
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityVerificationBinding
import com.seeeeshtheearth.app.modules.verification.`data`.model.VerificationRowModel
import com.seeeeshtheearth.app.modules.verification.`data`.viewmodel.VerificationVM
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VerificationActivity :
    BaseActivity<ActivityVerificationBinding>(R.layout.activity_verification) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: VerificationVM by viewModels<VerificationVM>()

    override fun onInitialized(): Unit {
      viewModel.navArguments = intent.extras?.getBundle("bundle")
      startSmartUserConsent()
      val verificationAdapter =
      VerificationAdapter(viewModel.verificationList.value?:mutableListOf())
      binding.recyclerVerification.adapter = verificationAdapter
      verificationAdapter.setOnItemClickListener(
      object : VerificationAdapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : VerificationRowModel) {
          onClickRecyclerVerification(view, position, item)
        }
      }
      )
      viewModel.verificationList.observe(this) {
        verificationAdapter.updateData(it)
      }
      binding.verificationVM = viewModel
    }

    override fun onStop(): Unit {
      super.onStop()
      unregisterReceiver(otpViewOtpviewBroadcastReceiver)
    }

    override fun onStart(): Unit {
      super.onStart()
      registerBroadcastReceiver()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    private fun startSmartUserConsent(): Unit {
      val client = SmsRetriever.getClient(this)
      client.startSmsUserConsent(null)
    }

    private fun registerBroadcastReceiver(): Unit {
      otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
      otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
      object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
        override fun onSuccess(intent: Intent?) {
          getActivityResult.launch(intent)
        }
        override fun onFailure() {

        }
      }
      val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
      registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
    }

    private fun getOtpFromMessage(message: String): Unit {
      val otpPattern: Pattern = Pattern.compile("(|^)\\d{4}")
      val matcher: Matcher = otpPattern.matcher(message)
      if (matcher.find()) {
        binding.otpViewOtpview?.setText(matcher.group(0))
      }
    }

    fun onClickRecyclerVerification(
      view: View,
      position: Int,
      item: VerificationRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "VERIFICATION_ACTIVITY"

    }
  }
