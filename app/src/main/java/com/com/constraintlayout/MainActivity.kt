package com.com.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val constrainsSet1 = ConstraintSet()
    val constrainsSet2 = ConstraintSet()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        constrainsSet1.clone(this,R.layout.activity_main)
        constrainsSet2.clone(this,R.layout.activity_main_1)

        button0.setOnClickListener{
            TransitionManager.beginDelayedTransition(constraintLayout)
            constrainsSet2.apply { constraintLayout }
        }

    }
}