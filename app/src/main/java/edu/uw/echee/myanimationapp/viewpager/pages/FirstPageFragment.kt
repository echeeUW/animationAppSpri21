package edu.uw.echee.myanimationapp.viewpager.pages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.uw.echee.myanimationapp.R
import edu.uw.echee.myanimationapp.databinding.FragmentFirstPageBinding


class FirstPageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = FragmentFirstPageBinding.inflate(inflater)
        with(binding) {

        }
        return binding.root
    }
}
