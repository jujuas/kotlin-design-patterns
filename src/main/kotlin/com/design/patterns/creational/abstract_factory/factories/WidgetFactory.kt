package com.design.patterns.creational.abstract_factory.factories

import com.design.patterns.creational.abstract_factory.products.abstract.Scrollbar
import com.design.patterns.creational.abstract_factory.products.abstract.Window

interface WidgetFactory {
    fun createScrollBar():Scrollbar
    fun createWindow():Window
}