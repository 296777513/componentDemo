package com.knight.module2

import android.app.Application
import android.content.Context
import android.util.Log
import com.knight.component.library.ModuleSpec

@ModuleSpec
class Module2Apllication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        Log.i("lyc", "attachBaseContext2");
    }

    override fun onCreate() {
        super.onCreate()
        Log.i("lyc", "onCreate2");
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.i("lyc", "onLowMemory2");

    }
}