package com.design.patterns.creational.prototype.shapes

import com.design.patterns.creational.factory_method.factory.Dialog

abstract class ShapePrototype(open var x: Int = 0,open var y: Int = 0,open var color: Int = 0) {

    fun ShapePrototype(target: ShapePrototype)  {
        this.x = target.x
        this.y = target.y
        this.color = target.color
    }

    abstract fun clone(): ShapePrototype
}