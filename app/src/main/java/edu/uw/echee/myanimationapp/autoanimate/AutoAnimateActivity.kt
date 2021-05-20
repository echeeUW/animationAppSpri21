package edu.uw.echee.myanimationapp.autoanimate

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.uw.echee.myanimationapp.databinding.ActivityAutoAnimateBinding

fun Context.startAutoAnimateActivity() = startActivity(Intent(this, AutoAnimateActivity::class.java))

class AutoAnimateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAutoAnimateBinding

    private var hasMovedBox = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAutoAnimateBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            btnMoveBox.setOnClickListener {

                redBox.visibility = if (!hasMovedBox) View.GONE else View.VISIBLE

                hasMovedBox = !hasMovedBox

            }

        }
    }
}
