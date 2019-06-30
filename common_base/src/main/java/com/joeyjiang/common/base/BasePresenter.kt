package com.joeyjiang.common.base

interface BasePresenter<T> {
    /**
     * 初始化view
     */
    fun initView(view: T)

    fun onDestory()

}