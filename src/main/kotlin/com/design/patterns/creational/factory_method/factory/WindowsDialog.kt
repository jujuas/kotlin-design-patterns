package com.design.patterns.creational.factory_method.factory

import com.design.patterns.creational.factory_method.buttons.Button
import com.design.patterns.creational.factory_method.buttons.WindowsButton

class WindowsDialog:Dialog() {
    override fun createButton(): Button {
        return WindowsButton()
    }
}