package com.mlaku.tourism.features.users

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.mlaku.tourism.R
import com.mlaku.tourism.utils.Fragments
import com.mlaku.tourism.utils.INavigationListener

/**
 * Created by Fandi Akhmad on 2019-05-05.
 * Called by SplashActivity and pass a Fragments.FRAGMENT_STATE
 */
class UserActivity : AppCompatActivity(), INavigationListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        supportActionBar?.apply {
            setDisplayShowTitleEnabled(false)
            setDisplayHomeAsUpEnabled(true)
            elevation = 0f
        }

        // Get a requested screen
        val requestState = intent.extras?.getInt(Fragments.FRAGMENT_STATE)
        attachFragment(requestState)
    }

    private fun attachFragment(fragmentState: Int?) {
        if (fragmentState == null) return
        val fragmentTrx = supportFragmentManager.beginTransaction()
        when (fragmentState) {
            SIGN_IN -> fragmentTrx.replace(
                R.id.flContent,
                SignInFragment.newInstance()
            )
            SIGN_UP -> fragmentTrx.replace(
                R.id.flContent,
                SignUpFragment.newInstance()
            )
            RESET_PASSWORD -> {
                fragmentTrx.add(
                    R.id.flContent,
                    ResetPasswordFragment.newInstance()
                )
                fragmentTrx.addToBackStack(null)
            }
        }
        fragmentTrx.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        fragmentTrx.commit()
    }

    override fun onNextScreen(nextScreen: Int) = attachFragment(nextScreen)

    companion object {
        const val SIGN_IN = 1
        const val SIGN_UP = 2
        const val RESET_PASSWORD = 3
    }
}
