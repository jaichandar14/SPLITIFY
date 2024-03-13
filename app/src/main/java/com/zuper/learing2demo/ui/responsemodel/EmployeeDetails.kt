package com.zuper.learing2demo.ui.responsemodel

import java.io.Serializable

data class EmployeeDetails(
    val _id: String,
    val name: String,
    val age: Int,
    val colour: String
) : Serializable