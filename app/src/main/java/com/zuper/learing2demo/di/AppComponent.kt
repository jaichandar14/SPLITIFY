package com.zuper.learing2demo.di

import com.zuper.learing2demo.factory.ViewModelFactory
import com.zuper.learing2demo.ui.homescreen.MainActivity
import dagger.Component

@Component(modules = [ApiModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
    fun viewmodelFactory():ViewModelFactory
}