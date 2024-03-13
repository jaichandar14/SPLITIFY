package com.zuper.learing2demo

import android.app.Application
import com.zuper.learing2demo.di.AppComponent
import com.zuper.learing2demo.di.DaggerAppComponent

class MyApplication: Application() {

    val appComponent:AppComponent by lazy {
DaggerAppComponent.create()
    }
}