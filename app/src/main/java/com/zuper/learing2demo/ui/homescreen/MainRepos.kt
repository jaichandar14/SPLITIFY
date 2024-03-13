package com.zuper.learing2demo.ui.homescreen

import com.zuper.learing2demo.apiservice.ApiService
import com.zuper.learing2demo.ui.responsemodel.EmployeeDetails
import javax.inject.Inject

class MainRepos @Inject constructor(private val apiservice:ApiService){

    suspend fun getApiCall():ArrayList<EmployeeDetails>{
      return apiservice.getApiCall()
    }
}