package com.knight.module2

import android.content.Context
import android.content.Intent
import com.knight.api.module2.IModule2Service
import com.knight.component.library.ServiceImpl

@ServiceImpl
class Module2ServiceImpl : IModule2Service {
    override fun getModule2Data(context: Context, type: Int): String {
        return when (type) {
            1 -> context.resources.getString(R.string.module2_1)
            2 -> context.resources.getString(R.string.module2_2)
            else -> context.resources.getString(R.string.module2_3)
        }
    }

    override fun startModule2Activity(context: Context) {
        context.startActivity(Intent(context, Module2Activity::class.java))
    }

}