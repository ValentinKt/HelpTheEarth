package com.seeeeshtheearth.app.modules.organizerprofileabout1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.base.BaseActivity
import com.seeeeshtheearth.app.databinding.ActivityOrganizerProfileAbout1Binding
import com.seeeeshtheearth.app.modules.organizerprofileabout1.`data`.viewmodel.OrganizerProfileAbout1VM
import kotlin.String
import kotlin.Unit

class OrganizerProfileAbout1Activity :
    BaseActivity<ActivityOrganizerProfileAbout1Binding>(R.layout.activity_organizer_profile_about1)
    {
  private val viewModel: OrganizerProfileAbout1VM by viewModels<OrganizerProfileAbout1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.organizerProfileAbout1VM = viewModel
    val adapter = OrganizerProfileAbout1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup33530,binding.viewPagerViewpager) { tab, position ->
      tab.text = OrganizerProfileAbout1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "ORGANIZER_PROFILE_ABOUT1ACTIVITY"

    }
  }
