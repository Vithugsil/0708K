package entities

import interfaces.IFly

class FlyWithBaloon : IFly {
    override fun performFlying() {
        println("I'm flying with balloons")
    }
}