package entities

import interfaces.IFly

class FlyWithWings : IFly {
    override fun performFlying() {
        println("I'm flying with wings")
    }
}