package com.joeyjiang.common.base

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import com.joeyjiang.common.base.AbstractActivity

/**
 * 所有activity都基于此类进行实现
 */
abstract class BaseActivity : AbstractActivity() {


    /**
     * activity不设置setContentView
     */
    private val NO_SETTING_CONTENTVIEW = -1
    protected lateinit var mActivity: Activity
    protected lateinit var mInflater: LayoutInflater

    // 是否沉侵式模式
    protected var isSystemBarTint = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initPresenter()
        if (getLayoutRes() != NO_SETTING_CONTENTVIEW)
            setContentView(getLayoutRes())
        if (isSystemBarTint) {
            // 设置状态栏透明
//            StatusBarUtil.setTransparent(this)
//            StatusBarUtil.setDarkMode(this)
        }
        mInflater = LayoutInflater.from(applicationContext)
        mActivity = this
        initMembers() // 初始化成员变量
        addListener() // 设置事件处理器
        initData(savedInstanceState)
    }

    /**
     * 初始化presenter,presenter和view绑定
     * testpresenter.initView(thi)
     */
    protected abstract fun initPresenter()

    // layoutRes
    protected abstract fun getLayoutRes(): Int

    // 初始化成员
    protected open fun initMembers() {}

    // 添加listener
    protected open fun addListener() {

    }

    // 初始化数据
    protected abstract fun initData(savedInstanceState: Bundle?)

}