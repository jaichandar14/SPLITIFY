package com.zuper.learing2demo.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zuper.learing2demo.ui.homescreen.MainRepos
import com.zuper.learing2demo.ui.homescreen.MainViewModel
import javax.inject.Inject

class ViewModelFactory @Inject constructor(var repos: MainRepos) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repos) as T
        }
        throw IllegalAccessException("Viewmodel")
    }
}