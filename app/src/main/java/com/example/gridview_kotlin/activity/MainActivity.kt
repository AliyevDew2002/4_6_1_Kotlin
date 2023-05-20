package com.example.gridview_kotlin.activity

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.gridview_kotlin.adapter.Grid_Adapter
import com.example.gridview_kotlin.databinding.ActivityMainBinding
import com.example.gridview_kotlin.model.Member

class MainActivity : AppCompatActivity() {
   lateinit var binding: ActivityMainBinding
    lateinit var context: Context


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
        initViews()
    }

    fun initViews() {
        context = this
        refreshAdapter(perapreList())
    }


    fun perapreList(): ArrayList<Member> {
        val members: ArrayList<Member> = ArrayList<Member>()
        for (i in 0..30) {
            members.add(Member("Shaxzod Aliyev$i"))
        }
        return members
    }


    fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = Grid_Adapter(this, members)
        binding.gridView.adapter=adapter
    }

}