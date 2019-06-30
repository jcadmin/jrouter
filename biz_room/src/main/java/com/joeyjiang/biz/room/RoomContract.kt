package com.joeyjiang.biz.room

import com.joeyjiang.common.base.BaseModel
import com.joeyjiang.common.base.BasePresenter
import com.joeyjiang.common.base.BaseView

class RoomContract {
    interface View : BaseView {

    }

    interface Presenter : BasePresenter<View> {

    }

    interface Model : BaseModel {

    }
}