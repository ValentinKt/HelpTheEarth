package com.seeeeshtheearth.app.modules.organizerprofilereview.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseFragment
import com.seeeeshtheearth.app.databinding.FragmentOrganizerProfileReviewBinding
import com.seeeeshtheearth.app.modules.organizerprofilereview.`data`.model.ListellipsefiftytwoRowModel
import com.seeeeshtheearth.app.modules.organizerprofilereview.`data`.viewmodel.OrganizerProfileReviewVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrganizerProfileReviewFragment :
    BaseFragment<FragmentOrganizerProfileReviewBinding>(R.layout.fragment_organizer_profile_review)
    {
  private val viewModel: OrganizerProfileReviewVM by viewModels<OrganizerProfileReviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listellipsefiftytwoAdapter =
    ListellipsefiftytwoAdapter(viewModel.listellipsefiftytwoList.value?:mutableListOf())
    binding.recyclerListellipsefiftytwo.adapter = listellipsefiftytwoAdapter
    listellipsefiftytwoAdapter.setOnItemClickListener(
    object : ListellipsefiftytwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsefiftytwoRowModel) {
        onClickRecyclerListellipsefiftytwo(view, position, item)
      }
    }
    )
    viewModel.listellipsefiftytwoList.observe(requireActivity()) {
      listellipsefiftytwoAdapter.updateData(it)
    }
    binding.organizerProfileReviewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipsefiftytwo(
    view: View,
    position: Int,
    item: ListellipsefiftytwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORGANIZER_PROFILE_REVIEW_FRAGMENT"

  }
}
