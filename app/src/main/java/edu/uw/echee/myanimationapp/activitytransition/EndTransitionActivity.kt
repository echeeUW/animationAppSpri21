package edu.uw.echee.myanimationapp.activitytransition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uw.echee.myanimationapp.databinding.ActivityEndTransitionBinding

class EndTransitionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEndTransitionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEndTransitionBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {



        }
    }
}
