package com.design.patterns.creational.factory_method

import com.design.patterns.creational.factory_method.buttons.Button
import com.design.patterns.creational.factory_method.factory.Dialog
import com.design.patterns.creational.factory_method.factory.HtmlDialog
import com.design.patterns.creational.factory_method.factory.WindowsDialog

class FactoryMethod(var buttonType:String){
    private lateinit var dialog: Dialog
    fun perform():String{
        return configure()
    }
    private fun configure():String{
        dialog = if (buttonType == "windows") WindowsDialog()
        else HtmlDialog()
        val button: Button = dialog.createButton()
        return button.render()
    }
}