package com.mlaku.tourism.features.splash

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.mlaku.tourism.R
import kotlinx.android.synthetic.main.fragment_splash.*

/**
 * A simple [Fragment] subclass.
 *
 */
class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
        initNavigation()
    }

    override fun onResume() {
        super.onResume()
        vBackground.requestFocus()
        vBackground.start()
    }

    override fun onPause() {
        super.onPause()
        vBackground.pause()
    }

    private fun initNavigation() {
        btnSignIn.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_signInFragment)
        }

        btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_signUpFragment)
        }
    }

    private fun initUI() {
        val uri = Uri.parse("android.resource://${activity?.packageName}/raw/vid_background_sample")
        vBackground.setVideoURI(uri)
        vBackground.setOnPreparedListener {
            it.isLooping = true
        }
    }
}
