package com.joeyjiang.common.sdk.arouter

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.joeyjiang.common.sdk.BuildConfig

object RouterManager {

    @JvmStatic
    fun initArouter(application: Application) {
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }

        ARouter.init(application)
    }
}