package com.seeeeshtheearth.app.modules.notification.ui

import android.view.View
import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityNotificationBinding
import com.seeeeshtheearth.app.modules.notification.`data`.model.ListellipsefiftyeightOneRowModel
import com.seeeeshtheearth.app.modules.notification.`data`.model.ListellipsefiftyeightThreeRowModel
import com.seeeeshtheearth.app.modules.notification.`data`.viewmodel.NotificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationActivity :
    BaseActivity<ActivityNotificationBinding>(R.layout.activity_notification) {
  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsefiftyeightOneAdapter =
    ListellipsefiftyeightOneAdapter(viewModel.listellipsefiftyeightOneList.value?:mutableListOf())
    binding.recyclerListellipsefiftyeightOne.adapter = listellipsefiftyeightOneAdapter
    listellipsefiftyeightOneAdapter.setOnItemClickListener(
    object : ListellipsefiftyeightOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListellipsefiftyeightOneRowModel) {
        onClickRecyclerListellipsefiftyeightOne(view, position, item)
      }
    }
    )
    viewModel.listellipsefiftyeightOneList.observe(this) {
      listellipsefiftyeightOneAdapter.updateData(it)
    }
    val listellipsefiftyeightThreeAdapter =
    ListellipsefiftyeightThreeAdapter(viewModel.listellipsefiftyeightThreeList.value?:mutableListOf())
    binding.recyclerListellipsefiftyeightThree.adapter = listellipsefiftyeightThreeAdapter
    listellipsefiftyeightThreeAdapter.setOnItemClickListener(
    object : ListellipsefiftyeightThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListellipsefiftyeightThreeRowModel) {
        onClickRecyclerListellipsefiftyeightThree(view, position, item)
      }
    }
    )
    viewModel.listellipsefiftyeightThreeList.observe(this) {
      listellipsefiftyeightThreeAdapter.updateData(it)
    }
    binding.notificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListellipsefiftyeightOne(
    view: View,
    position: Int,
    item: ListellipsefiftyeightOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipsefiftyeightThree(
    view: View,
    position: Int,
    item: ListellipsefiftyeightThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ACTIVITY"

  }
}
