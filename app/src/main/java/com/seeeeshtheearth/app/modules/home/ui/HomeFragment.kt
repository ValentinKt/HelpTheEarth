package com.seeeeshtheearth.app.modules.home.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseFragment
import com.seeeeshtheearth.app.databinding.FragmentHomeBinding
import com.seeeeshtheearth.app.modules.home.`data`.model.HomeRowModel
import com.seeeeshtheearth.app.modules.home.`data`.model.SpinnerGroupTenModel
import com.seeeeshtheearth.app.modules.home.`data`.viewmodel.HomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerGroupTenList.value = mutableListOf(
    SpinnerGroupTenModel("Item1"),
    SpinnerGroupTenModel("Item2"),
    SpinnerGroupTenModel("Item3"),
    SpinnerGroupTenModel("Item4"),
    SpinnerGroupTenModel("Item5")
    )
    val spinnerGroupTenAdapter =
    SpinnerGroupTenAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerGroupTenList.value?:
    mutableListOf())
    binding.spinnerGroupTen.adapter = spinnerGroupTenAdapter
    val homeAdapter = HomeAdapter(viewModel.homeList.value?:mutableListOf())
    binding.recyclerHome.adapter = homeAdapter
    homeAdapter.setOnItemClickListener(
    object : HomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
        onClickRecyclerHome(view, position, item)
      }
    }
    )
    viewModel.homeList.observe(requireActivity()) {
      homeAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerHome(
    view: View,
    position: Int,
    item: HomeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomeFragment {
      val fragment = HomeFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
