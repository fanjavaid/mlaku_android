package com.mlaku.tourism.features.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mlaku.tourism.R
import kotlinx.android.synthetic.main.fragment_sign_in.*

class SignInFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnResetPassword.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_resetPasswordFragment)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = SignInFragment()
    }
}
