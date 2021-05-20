package edu.uw.echee.myanimationapp.activitytransition

import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Pair
import edu.uw.echee.myanimationapp.databinding.ActivityStartTransitionBinding

fun Context.startStartTransitionActivity() = startActivity(Intent(this, StartTransitionActivity::class.java))

class StartTransitionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartTransitionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartTransitionBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            btnTransition.setOnClickListener {
                startEndActivity()
            }

        }
    }

    private fun startEndActivity() {
        val intent = Intent(this@StartTransitionActivity, EndTransitionActivity::class.java)

//        val options = ActivityOptions.makeSceneTransitionAnimation(this, binding.ivIcon1, "largeImage")

        val options = ActivityOptions.makeSceneTransitionAnimation(this,
            Pair.create(binding.ivIcon1, "largeImage"),
            Pair.create(binding.btnTransition, "transitionButton")
        )

        startActivity(intent, options.toBundle())
    }
}
