package com.mlaku.tourism.utils

import android.content.Context
import android.widget.Toast

/**
 * Created by Fandi Akhmad on 2019-05-05.
 */
object UIUtils {
    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}