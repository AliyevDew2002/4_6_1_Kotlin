package com.example.gridview_kotlin.model

class Member( var name: String){


    fun getNamee(): String? {
        return name
    }

    fun setNamee(name: String?) {
        if (name != null) {
            this.name = name
        }
    }
}