package com.com.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val constraintSet1 = ConstraintSet()
    val constraintSet2 = ConstraintSet()

    var setBool = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        constraintSet1.clone(this,R.layout.activity_main)
        constraintSet2.clone(this,R.layout.activity_main_1)

        button0.setOnClickListener{
            TransitionManager.beginDelayedTransition(constraintLayout)
            val currentSet = if(setBool)constraintSet1 else constraintSet2

            setBool = !setBool
            currentSet.applyTo(constraintLayout)
        }

    }
}