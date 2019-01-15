package com.knight.module1

import android.app.Activity
import android.os.Bundle
import com.knight.api.module2.IModule2Service
import com.knight.component.library.ServiceManager
import kotlinx.android.synthetic.main.activity_module1.*

class Module1Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module1)
        mBtn1.setOnClickListener {
            val service2 = ServiceManager.ins.getService(IModule2Service::class.java)
            service2?.startModule2Activity(this)
        }
    }
}
