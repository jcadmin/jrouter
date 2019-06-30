package com.joeyjiang.jrouter

import android.app.Application
import com.joeyjiang.common.sdk.arouter.RouterManager

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        RouterManager.initArouter(this)
    }
}