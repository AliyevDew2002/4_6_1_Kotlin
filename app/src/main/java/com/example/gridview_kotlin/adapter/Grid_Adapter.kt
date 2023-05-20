package com.example.gridview_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.gridview_kotlin.databinding.MemberListQolipBinding
import com.example.gridview_kotlin.model.Member

class Grid_Adapter(var context: Context, var members: ArrayList<Member>):BaseAdapter() {

    var inflater:LayoutInflater=LayoutInflater.from(context)

    lateinit var binding: MemberListQolipBinding


    override fun getCount(): Int {
        return members.size
    }

    override fun getItem(position: Int): Member? {
        return members[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        val member = members[position]
            //var binding: MemberListQolipBinding

        if (convertView == null) {
            binding= MemberListQolipBinding.inflate(inflater, parent, false)
            convertView = binding.getRoot()
            convertView.tag = binding
        }else{
            binding = convertView.tag as MemberListQolipBinding
        }

        binding.name.setText(member.getNamee())
        return convertView!!
    }

}