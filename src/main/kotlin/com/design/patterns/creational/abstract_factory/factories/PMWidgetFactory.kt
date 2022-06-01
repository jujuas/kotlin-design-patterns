package com.design.patterns.creational.abstract_factory.factories

import com.design.patterns.creational.abstract_factory.products.abstract.Scrollbar
import com.design.patterns.creational.abstract_factory.products.abstract.Window
import com.design.patterns.creational.abstract_factory.products.concrete.PMScrollBar
import com.design.patterns.creational.abstract_factory.products.concrete.PMWindow

class PMWidgetFactory:WidgetFactory {
    override fun createScrollBar(): Scrollbar {
        return PMScrollBar()
    }

    override fun createWindow(): Window {
        return PMWindow()
    }
}