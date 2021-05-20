package edu.uw.echee.myanimationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uw.echee.myanimationapp.activitytransition.startStartTransitionActivity
import edu.uw.echee.myanimationapp.autoanimate.startAutoAnimateActivity
import edu.uw.echee.myanimationapp.basicanimation.startBasicAnimationActivity
import edu.uw.echee.myanimationapp.databinding.ActivityMainBinding
import edu.uw.echee.myanimationapp.viewpager.startSwipePagesActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {
            btnBasicAnimation.setOnClickListener { startBasicAnimationActivity() }
            btnAutoAnimationLayoutChanges.setOnClickListener { startAutoAnimateActivity() }
            btnActivityTransition.setOnClickListener { startStartTransitionActivity() }
            btnViewPager2.setOnClickListener { startSwipePagesActivity() }
        }
    }
}
