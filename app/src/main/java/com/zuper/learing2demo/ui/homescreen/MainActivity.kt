package com.zuper.learing2demo.ui.homescreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.zuper.learing2demo.MyApplication
import com.zuper.learing2demo.R
import com.zuper.learing2demo.databinding.ActivityMainBinding
import com.zuper.learing2demo.factory.ViewModelFactory
import com.zuper.learing2demo.ui.expensesscreen.ExpensesActivity
import com.zuper.learing2demo.ui.responsemodel.EmployeeDetails
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
@Inject
lateinit var viewModelFactory: ViewModelFactory

var emp=ArrayList<EmployeeDetails>()
    lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as MyApplication).appComponent.inject(this)
        binding =DataBindingUtil.setContentView(this,R.layout.activity_main)
        val viewModel=ViewModelProvider(this,viewModelFactory)[MainViewModel::class.java]
        binding.viewModel=viewModel
        binding.lifecycleOwner=this

        binding.showExpenses.setOnClickListener {
            startActivity(Intent(this,ExpensesActivity::class.java))
        }
//        viewModel.getApiCall()

//        viewModel.empdet.observe(this, Observer {
//            emp.addAll(it)
////            binding.name.text= emp.get(0).name
//        })


    }
}