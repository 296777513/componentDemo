package com.knight.api.module1

import android.content.Context

interface IModule1Service {

    fun startModule1Activity(context: Context)

    fun getModule1Data(context: Context,type: Int): String
}
