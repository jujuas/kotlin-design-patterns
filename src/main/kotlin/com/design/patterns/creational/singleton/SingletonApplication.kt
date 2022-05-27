package com.design.patterns.creational.singleton
import com.design.patterns.creational.singleton.Singleton

abstract class SingletonApplication {
    fun application():String{
        val s1 = Singleton.getInstance()
        return "Singleton Works"
    }
}