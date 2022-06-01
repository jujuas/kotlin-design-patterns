package com.design.patterns.creational.abstract_factory.products.concrete

import com.design.patterns.creational.abstract_factory.products.abstract.Scrollbar

class MotifScrollBar:Scrollbar {
    override fun perform(): String {
        return "You created a MotifScrollBar object"
    }
}