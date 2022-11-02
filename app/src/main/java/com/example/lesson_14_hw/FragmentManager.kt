package com.example.lesson_14_hw

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.navigateToFragment(fragment: Fragment) {
    beginTransaction().replace(
        R.id.fragment_container, fragment).commit()
}