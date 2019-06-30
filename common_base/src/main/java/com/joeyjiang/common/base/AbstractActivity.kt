package com.joeyjiang.common.base

import com.joeyjiang.common.sdk.arouter.RouterUtil
import android.os.Bundle
import android.support.v4.app.FragmentActivity

abstract class AbstractActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RouterUtil.inject(this)
    }
}