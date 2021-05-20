package edu.uw.echee.myanimationapp.viewpager

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uw.echee.myanimationapp.databinding.ActivitySwipePagesBinding

fun Context.startSwipePagesActivity() = startActivity(Intent(this, SwipePagesActivity::class.java))

class SwipePagesActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySwipePagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwipePagesBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {



        }
    }
}
