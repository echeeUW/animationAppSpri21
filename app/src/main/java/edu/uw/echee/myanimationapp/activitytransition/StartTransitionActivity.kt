package edu.uw.echee.myanimationapp.activitytransition

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uw.echee.myanimationapp.databinding.ActivityStartTransitionBinding

fun Context.startStartTransitionActivity() = startActivity(Intent(this, StartTransitionActivity::class.java))

class StartTransitionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartTransitionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartTransitionBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {



        }
    }
}
