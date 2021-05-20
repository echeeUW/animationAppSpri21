package edu.uw.echee.myanimationapp.basicanimation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import edu.uw.echee.myanimationapp.databinding.ActivityBasicAnimationBinding

fun Context.startBasicAnimationActivity() = startActivity(Intent(this, BasicAnimationActivity::class.java))

class BasicAnimationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBasicAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBasicAnimationBinding.inflate(layoutInflater).apply { setContentView(root) }
        with(binding) {

            btnMoveBox.setOnClickListener {
                animateRedBox()
                animateBlueBox()
            }
        }
    }

    private var hasMovedRedBox = false

    private fun animateRedBox() = with(binding) {
        // Move box to the right
        if (!hasMovedRedBox) {
            redBox.animate()
                .translationX(convertDpToPixel(300))
                .rotation(360f)
                .alpha(.2f)
                .setDuration(1000)
                .withEndAction {
                    redBox.visibility = View.INVISIBLE
                }
                .start()

        } else {
            redBox.animate()
                .translationX(convertDpToPixel(0))
                .rotation(0f)
                .alpha(1f)
                .setDuration(1000)
                .start()
        }
        hasMovedRedBox = !hasMovedRedBox
    }

    private fun animateBlueBox() = with(binding) {

        if (hasMovedRedBox) {
            blueBox.animate()
                .translationX(convertDpToPixel(-100))
                .setDuration(1000)
                .start()
        } else {
            blueBox.animate()
                .translationX(convertDpToPixel(0))
                .setDuration(1000)
                .start()
        }

    }
}


fun Context.convertDpToPixel(dp: Number) = dp.toFloat() * (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)
fun Context.convertPixelToDp(px: Number) = px.toFloat() / (resources.displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)
