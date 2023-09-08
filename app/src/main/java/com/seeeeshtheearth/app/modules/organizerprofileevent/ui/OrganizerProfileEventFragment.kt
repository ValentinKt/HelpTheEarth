package com.seeeeshtheearth.app.modules.organizerprofileevent.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseFragment
import com.seeeeshtheearth.app.databinding.FragmentOrganizerProfileEventBinding
import com.seeeeshtheearth.app.modules.organizerprofileevent.`data`.model.ListtimeOne1RowModel
import com.seeeeshtheearth.app.modules.organizerprofileevent.`data`.viewmodel.OrganizerProfileEventVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrganizerProfileEventFragment :
    BaseFragment<FragmentOrganizerProfileEventBinding>(R.layout.fragment_organizer_profile_event) {
  private val viewModel: OrganizerProfileEventVM by viewModels<OrganizerProfileEventVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listtimeOneAdapter =
    ListtimeOneAdapter(viewModel.listtimeOneList.value?:mutableListOf())
    binding.recyclerListtimeOne.adapter = listtimeOneAdapter
    listtimeOneAdapter.setOnItemClickListener(
    object : ListtimeOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtimeOne1RowModel) {
        onClickRecyclerListtimeOne(view, position, item)
      }
    }
    )
    viewModel.listtimeOneList.observe(requireActivity()) {
      listtimeOneAdapter.updateData(it)
    }
    binding.organizerProfileEventVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListtimeOne(
    view: View,
    position: Int,
    item: ListtimeOne1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORGANIZER_PROFILE_EVENT_FRAGMENT"

  }
}
