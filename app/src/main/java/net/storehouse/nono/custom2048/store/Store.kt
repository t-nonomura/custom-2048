package net.storehouse.nono.custom2048.store

import androidx.lifecycle.ViewModel
import org.greenrobot.eventbus.EventBus

open class Store : ViewModel() {

    init {
        EventBus.getDefault().register(this)
    }

    override fun onCleared() {
        EventBus.getDefault().unregister(this)
    }
}
