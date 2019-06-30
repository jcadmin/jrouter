package com.joeyjiang.common.base

import com.alibaba.android.arouter.facade.template.IProvider

interface BasePresenter<T> : IProvider {
    /**
     * 初始化view
     */
    fun initView(view: T)

    fun onDestory()

}