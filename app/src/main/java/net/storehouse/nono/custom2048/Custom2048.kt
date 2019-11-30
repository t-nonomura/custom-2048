package net.storehouse.nono.custom2048

import android.app.Application
import net.storehouse.nono.custom2048.di.koin.KoinStarter

class Custom2048 : Application() {
    override fun onCreate() {
        super.onCreate()
        
        KoinStarter.onCreate(applicationContext)
    }
}
