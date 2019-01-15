package com.knight.module2

import android.app.Activity
import android.os.Bundle
import com.knight.api.module1.IModule1Service
import com.knight.component.library.ServiceManager
import kotlinx.android.synthetic.main.activity_module2.*

class Module2Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module2)
        mBtn1.setOnClickListener {
            val service1 = ServiceManager.ins.getService(IModule1Service::class.java)
            service1?.startModule1Activity(this)
        }
    }
}
