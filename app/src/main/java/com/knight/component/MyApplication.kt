package com.knight.component

import android.app.Application
import android.content.Context
import com.knight.component.library.AppSpec

@AppSpec
class MyApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
    }
}