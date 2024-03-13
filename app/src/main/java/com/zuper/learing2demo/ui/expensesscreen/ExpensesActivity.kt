package com.zuper.learing2demo.ui.expensesscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.zuper.learing2demo.R
import com.zuper.learing2demo.databinding.ActivityExpensesBinding
import com.zuper.learing2demo.ui.gropexpenses.GroupActivity
import com.zuper.learing2demo.ui.personexpenses.PersonalExpActivity


class ExpensesActivity : AppCompatActivity() {
    lateinit var binding: ActivityExpensesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_expenses)

        binding.apply {
            backBtn.setOnClickListener {
                finish()
            }
            personalExp.setOnClickListener {
                startActivity(Intent(this@ExpensesActivity,PersonalExpActivity::class.java))
            }

            groupExo.setOnClickListener {
                startActivity(Intent(this@ExpensesActivity,GroupActivity::class.java))

            }
        }


    }
}