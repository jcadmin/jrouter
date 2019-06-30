package com.joeyjiang.common.sdk.arouter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.support.annotation.Nullable
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.launcher.ARouter
import java.io.Serializable

object RouterUtil {

    var postcard: Postcard? = null

    @JvmStatic
    fun inject(thiz: Any) {
        ARouter.getInstance().inject(thiz)
    }

    @JvmStatic
    fun go(path: String): Any? {
        return go(path, null)
    }

    @JvmStatic
    fun go(path: String, bundle: Bundle?): Any? {
        return go(null, path, bundle)
    }

    @JvmStatic
    fun go(context: Context, path: String): Any? {
        return go(context, path, null)
    }

    @JvmStatic
    fun go(context: Context?, path: String, bundle: Bundle?): Any? {
        return go(context, path, bundle, Intent.FLAG_ACTIVITY_NEW_TASK)
    }

    @JvmStatic
    fun go(context: Context?, path: String, bundle: Bundle?, flg: Int): Any? {
        return ARouter.getInstance().build(path).with(bundle).withFlags(flg).navigation(context)
    }

    @JvmStatic
    fun go(activity: Activity, path: String, bundle: Bundle?, requestCode: Int, flg: Int) {
        ARouter.getInstance().build(path).with(bundle).withFlags(flg).navigation(activity, requestCode)
    }

    fun build(path: String): RouterUtil {
        postcard = ARouter.getInstance().build(path)
        return this
    }

    fun with(bundle: Bundle?): RouterUtil {
        postcard?.with(bundle)
        return this
    }

    fun withFlags(flg: Int): RouterUtil {
        postcard?.withFlags(flg)
        return this
    }

    fun withString(@Nullable key: String, values: String): RouterUtil {
        postcard?.withString(key, values)
        return this
    }

    fun withLong(@Nullable key: String, values: Long): RouterUtil {
        postcard?.withLong(key, values)
        return this
    }

    fun withInt(@Nullable key: String, values: Int): RouterUtil {
        postcard?.withInt(key, values)
        return this
    }

    fun withBoolean(@Nullable key: String, values: Boolean): RouterUtil {
        postcard?.withBoolean(key, values)
        return this
    }

    fun withSerializable(@Nullable key: String, @Nullable values: Serializable): RouterUtil {
        postcard?.withSerializable(key, values)
        return this
    }

    fun withParcelable(@Nullable key: String, @Nullable values: Parcelable): RouterUtil {
        postcard?.withParcelable(key, values)
        return this
    }

    fun withObject(@Nullable key: String, @Nullable values: Any): RouterUtil {
        postcard?.withObject(key, values)
        return this
    }

    fun launch(): Any? {
        return launch(null)
    }

    fun launch(context: Context?): Any? {
        return postcard?.navigation(context)
    }

    fun launch(context: Activity?, requestCode: Int) {
        postcard?.navigation(context, requestCode)
    }

}