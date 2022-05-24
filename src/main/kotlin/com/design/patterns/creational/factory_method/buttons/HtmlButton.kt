package com.design.patterns.creational.factory_method.buttons

import com.design.patterns.creational.factory_method.buttons.Button

class HtmlButton : Button {
    override fun render():String {
        return "Criando botao HTML"
    }

    override fun onClick():String {
        return "Clicando no botao HTML"
    }
}