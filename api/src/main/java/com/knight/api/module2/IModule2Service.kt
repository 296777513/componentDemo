package com.knight.api.module2

import android.content.Context

interface IModule2Service {

    fun startModule2Activity(context: Context)


    fun getModule2Data(context: Context, type: Int): String

}
