package edu.uw.echee.myanimationapp.autoanimate

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uw.echee.myanimationapp.databinding.ActivityAutoAnimateBinding

fun Context.startAutoAnimateActivity() = startActivity(Intent(this, AutoAnimateActivity::class.java))

class AutoAnimateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAutoAnimateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAutoAnimateBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            btnMoveBox.setOnClickListener {  }

        }
    }
}
