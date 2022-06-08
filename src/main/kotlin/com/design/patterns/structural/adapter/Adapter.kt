package com.design.patterns.structural.adapter

class Adapter:Target() {
    private lateinit var adaptee: Adaptee

    fun Adapter(adaptee: Adaptee){
        this.adaptee = Adaptee()
    }

    override fun request():String{
        val result = this.adaptee.specificRequest().split("").reversed()
        return "Adapter: (Translated)${result}"
    }
}