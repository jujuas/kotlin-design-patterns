package com.design.patterns.creational.factory_method.factory

import com.design.patterns.creational.factory_method.buttons.Button

abstract class Dialog {
    abstract fun createButton():Button
}