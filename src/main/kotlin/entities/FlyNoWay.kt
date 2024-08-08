package entities

import interfaces.IFly

class FlyNoWay : IFly{
    override fun performFlying() {
        println("I can't fly")
    }
}