package net.storehouse.nono.custom2048.util

import android.os.Handler
import android.os.Looper
import net.storehouse.nono.custom2048.action.Action
import org.greenrobot.eventbus.EventBus

interface Dispatcher {
    fun dispatch(action: Action)
}

class DispatcherImpl : Dispatcher {
    private val handler = Handler(Looper.getMainLooper())

    override fun dispatch(action: Action) {
        if (isMainThread()) {
            EventBus.getDefault().post(action)
        } else {
            handler.post { EventBus.getDefault().post(action) }
        }

    }

    private fun isMainThread(): Boolean {
        return Thread.currentThread().id == Looper.getMainLooper().thread.id
    }
}

