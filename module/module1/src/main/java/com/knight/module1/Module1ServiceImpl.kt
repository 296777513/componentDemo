package com.knight.module1

import android.content.Context
import android.content.Intent
import com.knight.api.module1.IModule1Service
import com.knight.component.library.ServiceImpl

@ServiceImpl
class Module1ServiceImpl : IModule1Service {
    override fun getModule1Data(context: Context, type: Int): String {
        return when (type) {
            1 -> context.resources.getString(R.string.module1_1)
            2 -> context.resources.getString(R.string.module1_2)
            else -> context.resources.getString(R.string.module1_3)
        }
    }

    override fun startModule1Activity(context: Context) {
        context.startActivity(Intent(context, Module1Activity::class.java))
    }

}