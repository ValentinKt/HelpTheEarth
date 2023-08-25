package com.seeeeshtheearth.app.modules.share.ui

import androidx.fragment.app.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.seeeeshtheearth.app.databinding.BottomsheetShareBinding
import com.seeeeshtheearth.app.modules.share.`data`.viewmodel.ShareVM
import kotlin.String
import kotlin.Unit

class ShareBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetShareBinding>(R.layout.bottomsheet_share) {
  private val viewModel: ShareVM by viewModels<ShareVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.shareVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SHARE_BOTTOMSHEET"

  }
}
