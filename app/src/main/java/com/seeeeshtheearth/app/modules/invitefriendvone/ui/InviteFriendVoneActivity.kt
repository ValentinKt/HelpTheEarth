package com.seeeeshtheearth.app.modules.invitefriendvone.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityInviteFriendVoneBinding
import com.seeeeshtheearth.app.modules.invitefriendvone.`data`.model.ListellipsefiftyeightRowModel
import com.seeeeshtheearth.app.modules.invitefriendvone.`data`.viewmodel.InviteFriendVoneVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InviteFriendVoneActivity :
    BaseActivity<ActivityInviteFriendVoneBinding>(R.layout.activity_invite_friend_vone) {
  private val viewModel: InviteFriendVoneVM by viewModels<InviteFriendVoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsefiftyeightAdapter =
    ListellipsefiftyeightAdapter(viewModel.listellipsefiftyeightList.value?:mutableListOf())
    binding.recyclerListellipsefiftyeight.adapter = listellipsefiftyeightAdapter
    listellipsefiftyeightAdapter.setOnItemClickListener(
    object : ListellipsefiftyeightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListellipsefiftyeightRowModel) {
        onClickRecyclerListellipsefiftyeight(view, position, item)
      }
    }
    )
    viewModel.listellipsefiftyeightList.observe(this) {
      listellipsefiftyeightAdapter.updateData(it)
    }
    binding.inviteFriendVoneVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipsefiftyeight(
    view: View,
    position: Int,
    item: ListellipsefiftyeightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "INVITE_FRIEND_VONE_ACTIVITY"

    }
  }
