package edu.uw.echee.myanimationapp.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import edu.uw.echee.myanimationapp.viewpager.pages.FirstPageFragment
import edu.uw.echee.myanimationapp.viewpager.pages.SecondPageFragment

class MyPageAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {

    private val listOfFragments = listOf(
        FirstPageFragment(),
        SecondPageFragment()
    )

    override fun getItemCount(): Int = listOfFragments.size

    override fun createFragment(position: Int): Fragment {
        val fragment = listOfFragments[position]

        return fragment
    }

}
