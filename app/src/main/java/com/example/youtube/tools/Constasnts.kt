package com.example.youtube.tools

import android.content.Context
import android.view.View
import android.widget.Toast

object Constasnts {

    const val CHANNEL_ID = "UCA675HRkru0v-ls0Q2oBPqQ"
    const val PART = "snippet, contentDetails"
    const val MAX_RESULTS = 30

    const val VISIBLE = View.VISIBLE
    const val INVISIBLE = View.INVISIBLE


    fun Context.showToast(msg: String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

}