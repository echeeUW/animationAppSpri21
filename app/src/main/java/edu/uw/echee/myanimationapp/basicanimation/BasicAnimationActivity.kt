package edu.uw.echee.myanimationapp.basicanimation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.uw.echee.myanimationapp.databinding.ActivityBasicAnimationBinding

fun Context.startBasicAnimationActivity() = startActivity(Intent(this, BasicAnimationActivity::class.java))

class BasicAnimationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBasicAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicAnimationBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            btnMoveBox.setOnClickListener {

            }
        }
    }

    private fun animateBox() = with(binding) {

    }
}

/*
 ...
 fun Context.convertDpToPixel(dp: Number) = dp.toFloat() * (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)
 fun Context.convertPixelToDp(px: Number) = px.toFloat() / (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)
*/
