package com.seeeeshtheearth.app.modules.seeallevents.ui

import android.view.View
import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivitySeeAllEventsBinding
import com.seeeeshtheearth.app.modules.seeallevents.`data`.model.SeeAllEventsRowModel
import com.seeeeshtheearth.app.modules.seeallevents.`data`.viewmodel.SeeAllEventsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SeeAllEventsActivity :
    BaseActivity<ActivitySeeAllEventsBinding>(R.layout.activity_see_all_events) {
  private val viewModel: SeeAllEventsVM by viewModels<SeeAllEventsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val seeAllEventsAdapter =
    SeeAllEventsAdapter(viewModel.seeAllEventsList.value?:mutableListOf())
    binding.recyclerSeeAllEvents.adapter = seeAllEventsAdapter
    seeAllEventsAdapter.setOnItemClickListener(
    object : SeeAllEventsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SeeAllEventsRowModel) {
        onClickRecyclerSeeAllEvents(view, position, item)
      }
    }
    )
    viewModel.seeAllEventsList.observe(this) {
      seeAllEventsAdapter.updateData(it)
    }
    binding.seeAllEventsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSeeAllEvents(
    view: View,
    position: Int,
    item: SeeAllEventsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEE_ALL_EVENTS_ACTIVITY"

  }
}
