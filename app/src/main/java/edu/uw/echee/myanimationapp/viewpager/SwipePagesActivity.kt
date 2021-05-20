package edu.uw.echee.myanimationapp.viewpager

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import edu.uw.echee.myanimationapp.databinding.ActivitySwipePagesBinding

fun Context.startSwipePagesActivity() = startActivity(Intent(this, SwipePagesActivity::class.java))

class SwipePagesActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySwipePagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwipePagesBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            pager.adapter = MyPageAdapter(this@SwipePagesActivity)

            btnPage1.setOnClickListener {
                pager.currentItem = 0
            }

            btnPage2.setOnClickListener {
                pager.currentItem = 1
            }

            pager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    Toast.makeText(this@SwipePagesActivity, "Current: $position", Toast.LENGTH_SHORT).show()
                }
            })

        }
    }
}
