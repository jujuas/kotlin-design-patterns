package com.design.patterns.creational.abstract_factory.factories

import com.design.patterns.creational.abstract_factory.products.abstract.Scrollbar
import com.design.patterns.creational.abstract_factory.products.abstract.Window
import com.design.patterns.creational.abstract_factory.products.concrete.MotifScrollBar
import com.design.patterns.creational.abstract_factory.products.concrete.MotifWindow

class MotifWidgetFactory:WidgetFactory {
    override fun createScrollBar(): Scrollbar {
        return MotifScrollBar()
    }

    override fun createWindow(): Window {
        return MotifWindow()
    }
}