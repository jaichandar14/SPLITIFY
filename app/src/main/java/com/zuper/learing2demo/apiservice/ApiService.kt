package com.zuper.learing2demo.apiservice

import com.zuper.learing2demo.ui.responsemodel.EmployeeDetails
import retrofit2.http.GET
import kotlin.coroutines.Continuation

interface ApiService {

    @GET("unicorns")
    suspend fun getApiCall():ArrayList<EmployeeDetails>
}
