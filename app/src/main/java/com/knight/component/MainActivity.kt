package com.knight.component

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.knight.api.module1.IModule1Service
import com.knight.api.module2.IModule2Service
import com.knight.component.library.ServiceManager
import  kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var type = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtn1.setOnClickListener {
            val service1 = ServiceManager.ins.getService(IModule1Service::class.java)
            service1?.startModule1Activity(this)
        }

        mBtn2.setOnClickListener {
            val service2 = ServiceManager.ins.getService(IModule2Service::class.java)
            service2?.startModule2Activity(this)
        }

        mBtn3.setOnClickListener {
            val service1 = ServiceManager.ins.getService(IModule1Service::class.java)
            Toast.makeText(this, service1?.getModule1Data(this, (type++) % 3), Toast.LENGTH_LONG).show()
        }

        mBtn4.setOnClickListener {
            val service2 = ServiceManager.ins.getService(IModule2Service::class.java)
            Toast.makeText(this, service2?.getModule2Data(this, (type++) % 3), Toast.LENGTH_LONG).show()
        }
    }
}
