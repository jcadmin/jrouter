package com.joeyjiang.biz.room

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.joeyjiang.common.data.room.RoomPresenterPathConstants
import java.lang.ref.WeakReference

@Route(path = RoomPresenterPathConstants.ROOM)
class RoomPresenter : RoomContract.Presenter {

    private var mView: WeakReference<RoomContract.View>? = null
    private var mContext: WeakReference<Context>? = null

    override fun initView(view: RoomContract.View) {
        mView = WeakReference(view)
    }

    override fun init(context: Context?) {
        if (context != null) {
            mContext = WeakReference(context)
        }
    }

    override fun onDestory() {
        mView?.clear()
        mContext?.clear()
    }
}