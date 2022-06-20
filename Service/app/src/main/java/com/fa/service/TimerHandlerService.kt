package com.fa.service

import android.app.Service
import android.content.Intent
import android.util.Log
import android.widget.Toast

class TimerHandlerService : Service() {
    override fun onBind(intent: Intent?) = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val msg = intent?.getStringExtra("MSG")

        msg.let {
            Log.e("Message", it!!)
        }
        return START_STICKY
    }

    override fun onCreate() {
        showToastMsg("Servis çalışmaya başladı.")
    }

    override fun onDestroy() {
        showToastMsg("Servis durdu.")
    }

    fun showToastMsg(msgContent: String) {
        Toast.makeText(this, msgContent, Toast.LENGTH_LONG).show()
    }

}