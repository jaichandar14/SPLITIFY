package com.zuper.learing2demo.ui.homescreen

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zuper.learing2demo.ui.responsemodel.EmployeeDetails
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(var repos: MainRepos) :ViewModel() {
val empdet= MutableLiveData<ArrayList<EmployeeDetails>>()
val _empdet:LiveData<ArrayList<EmployeeDetails>> = empdet
    fun getApiCall() {
        viewModelScope.launch{
           empdet.postValue(repos.getApiCall())
            Log.d("AG", "getApiCall2: ${empdet}")

        }
        Log.d("AG", "getApiCall3: ${empdet.value}")

    }
}