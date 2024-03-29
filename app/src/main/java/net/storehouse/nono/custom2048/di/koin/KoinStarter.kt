package net.storehouse.nono.custom2048.di.koin

import android.content.Context
import net.storehouse.nono.custom2048.util.Dispatcher
import net.storehouse.nono.custom2048.util.DispatcherImpl
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

object KoinStarter {
    fun onCreate(context: Context) {
        val appModule = module {
            factory { DispatcherImpl() as Dispatcher }
        }

        startKoin {
            androidContext(context)
            modules(appModule)
        }
    }
}
