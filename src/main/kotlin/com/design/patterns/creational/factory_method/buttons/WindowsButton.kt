package com.design.patterns.creational.factory_method.buttons

import com.design.patterns.creational.factory_method.buttons.Button

class WindowsButton : Button {
    override fun render():String {
        return "Criando botao Windows"
    }

    override fun onClick():String {
        return "Clicando no botao Windows"
    }
}