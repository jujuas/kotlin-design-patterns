package com.design.patterns.structural.adapter

open class Target {
    open fun request():String{
        return "Target: The default target's behavior."
    }
}