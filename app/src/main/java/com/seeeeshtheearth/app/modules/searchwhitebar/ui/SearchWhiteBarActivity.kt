package com.seeeeshtheearth.app.modules.searchwhitebar.ui

import android.view.View
import androidx.activity.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivitySearchWhiteBarBinding
import com.seeeeshtheearth.app.modules.searchwhitebar.`data`.model.ListtimeOneRowModel
import com.seeeeshtheearth.app.modules.searchwhitebar.`data`.viewmodel.SearchWhiteBarVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchWhiteBarActivity :
    BaseActivity<ActivitySearchWhiteBarBinding>(R.layout.activity_search_white_bar) {
  private val viewModel: SearchWhiteBarVM by viewModels<SearchWhiteBarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtimeOneAdapter =
    ListtimeOneAdapter(viewModel.listtimeOneList.value?:mutableListOf())
    binding.recyclerListtimeOne.adapter = listtimeOneAdapter
    listtimeOneAdapter.setOnItemClickListener(
    object : ListtimeOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtimeOneRowModel) {
        onClickRecyclerListtimeOne(view, position, item)
      }
    }
    )
    viewModel.listtimeOneList.observe(this) {
      listtimeOneAdapter.updateData(it)
    }
    binding.searchWhiteBarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListtimeOne(
    view: View,
    position: Int,
    item: ListtimeOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_WHITE_BAR_ACTIVITY"

  }
}
