package com.design.patterns.creational.abstract_factory.products.concrete

import com.design.patterns.creational.abstract_factory.products.abstract.Scrollbar

class PMScrollBar:Scrollbar {
    override fun perform(): String {
        return "You created a PMScrollBar object"
    }
}