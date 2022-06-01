package com.design.patterns.creational.abstract_factory.products.concrete

import com.design.patterns.creational.abstract_factory.products.abstract.Window

class PMWindow:Window {
    override fun perform(): String {
        return "You created a PMWindow object"
    }
}