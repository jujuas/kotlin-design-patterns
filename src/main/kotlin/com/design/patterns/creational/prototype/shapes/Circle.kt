package com.design.patterns.creational.prototype.shapes

class Circle(override var x: Int, override var y: Int, override var color: Int,var radius:Int = 0): ShapePrototype() {

    private fun Circle(target:Circle):ShapePrototype {
        this.x = target.x
        this.y = target.y
        this.color = target.color
        this.radius = target.radius
        return Circle(this)
    }
    override fun clone(): ShapePrototype {
        return Circle(this)
    }
}