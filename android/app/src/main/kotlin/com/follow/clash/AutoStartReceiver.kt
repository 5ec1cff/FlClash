package com.follow.clash

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import com.follow.clash.common.GlobalState
import kotlinx.coroutines.launch

class AutoStartReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            Intent.ACTION_BOOT_COMPLETED, Intent.ACTION_MY_PACKAGE_REPLACED -> {
                GlobalState.launch {
                    State.handleStartServiceAction()
                }
            }
        }
    }
}
