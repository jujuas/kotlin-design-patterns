package com.design.patterns.creational.factory_method.factory

import com.design.patterns.creational.factory_method.buttons.Button
import com.design.patterns.creational.factory_method.buttons.HtmlButton

class HtmlDialog: Dialog() {
    override fun createButton(): Button {
        return HtmlButton()
    }
}