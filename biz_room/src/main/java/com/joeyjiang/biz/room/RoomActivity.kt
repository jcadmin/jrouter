package com.joeyjiang.biz.room

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.joeyjiang.common.base.BaseActivity
import com.joeyjiang.common.data.room.RoomPathConstants

@Route(path = RoomPathConstants.ROOM)
class RoomActivity : BaseActivity(), RoomContract.View {

    @Autowired
    @JvmField
    var roomPresente: RoomPresenter? = null

    override fun initPresenter() {
        roomPresente?.initView(this)
    }

    override fun getLayoutRes(): Int {
        return R.layout.room_activity_room
    }

    override fun initData(savedInstanceState: Bundle?) {
    }
}