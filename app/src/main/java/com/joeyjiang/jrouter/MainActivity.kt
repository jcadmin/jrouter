package com.joeyjiang.jrouter

import android.os.Bundle
import com.joeyjiang.common.base.AbstractActivity
import com.joeyjiang.common.data.room.RoomPathConstants
import com.joeyjiang.common.sdk.arouter.RouterUtil

class MainActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RouterUtil.go(RoomPathConstants.ROOM)
    }
}
