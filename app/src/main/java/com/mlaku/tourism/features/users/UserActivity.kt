package com.mlaku.tourism.features.users

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mlaku.tourism.R

/**
 * Created by Fandi Akhmad on 2019-05-05.
 * Called by SplashActivity and pass a Fragments.FRAGMENT_STATE
 */
class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        supportActionBar?.apply {
            setDisplayShowTitleEnabled(false)
            setDisplayHomeAsUpEnabled(true)
            elevation = 0f
        }
    }
}
