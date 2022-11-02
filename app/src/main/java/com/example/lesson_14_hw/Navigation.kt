package com.example.lesson_14_hw

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

object Navigation {

    fun navigateFromActivityToFragment(activity: AppCompatActivity, fragment: Fragment) {
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment).commit()

    }
}