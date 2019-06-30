package com.joeyjiang.common.base

import android.app.Application
import com.joeyjiang.common.sdk.arouter.RouterManager

abstract class BaseRouterApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        RouterManager.initArouter(this)
    }
}