package com.zuper.learing2demo.ui.personexpenses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zuper.learing2demo.R
import com.zuper.learing2demo.databinding.ActivityExpensesBinding
import com.zuper.learing2demo.databinding.ActivityPersonalExpBinding
import com.zuper.learing2demo.ui.personexpenses.adapter.ExphistoryAdapter

class PersonalExpActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: ExphistoryAdapter
    lateinit var binding:ActivityPersonalExpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=DataBindingUtil.setContentView(this,R.layout.activity_personal_exp)
        mIntitalizeRecylerView()
        var dataset=ArrayList<String>()
        dataset.add("jai")
        dataset.add("jai1")
        dataset.add("jai2")
        dataset.add("jai3")

        adapter.refreshItems(dataset)
    }
    private  fun mIntitalizeRecylerView(){
        recyclerView = binding.recyclerView
        adapter = ExphistoryAdapter(this)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
    }
}