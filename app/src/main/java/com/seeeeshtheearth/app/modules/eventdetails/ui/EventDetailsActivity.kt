package com.seeeeshtheearth.app.modules.eventdetails.ui

import android.view.View
import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityEventDetailsBinding
import com.seeeeshtheearth.app.modules.eventdetails.`data`.model.EventDetailsRowModel
import com.seeeeshtheearth.app.modules.eventdetails.`data`.viewmodel.EventDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EventDetailsActivity :
    BaseActivity<ActivityEventDetailsBinding>(R.layout.activity_event_details) {
  private val viewModel: EventDetailsVM by viewModels<EventDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val eventDetailsAdapter =
    EventDetailsAdapter(viewModel.eventDetailsList.value?:mutableListOf())
    binding.recyclerEventDetails.adapter = eventDetailsAdapter
    eventDetailsAdapter.setOnItemClickListener(
    object : EventDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EventDetailsRowModel) {
        onClickRecyclerEventDetails(view, position, item)
      }
    }
    )
    viewModel.eventDetailsList.observe(this) {
      eventDetailsAdapter.updateData(it)
    }
    binding.eventDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerEventDetails(
    view: View,
    position: Int,
    item: EventDetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EVENT_DETAILS_ACTIVITY"

  }
}
