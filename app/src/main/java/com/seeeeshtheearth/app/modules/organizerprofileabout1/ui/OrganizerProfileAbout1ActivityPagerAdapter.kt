package com.seeeeshtheearth.app.modules.organizerprofileabout1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.seeeeshtheearth.app.R
import com.seeeeshtheearth.app.appcomponents.di.MyApp
import com.seeeeshtheearth.app.modules.organizerprofileabout.ui.OrganizerProfileAboutFragment
import com.seeeeshtheearth.app.modules.organizerprofileevent.ui.OrganizerProfileEventFragment
import com.seeeeshtheearth.app.modules.organizerprofilereview.ui.OrganizerProfileReviewFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class OrganizerProfileAbout1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_about),MyApp.getInstance().resources.getString(R.string.lbl_event),MyApp.getInstance().resources.getString(R.string.lbl_reviews))

        val viewPages: List<Fragment> =
                listOf(OrganizerProfileAboutFragment(),OrganizerProfileEventFragment(),OrganizerProfileReviewFragment())

    }
}
