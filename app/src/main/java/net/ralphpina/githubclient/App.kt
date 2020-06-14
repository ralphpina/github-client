package net.ralphpina.githubclient

import android.app.Application
import net.ralphpina.home.view.di.homeViewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(homeViewModule)
        }
    }
}