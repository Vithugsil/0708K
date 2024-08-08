package entities

import interfaces.IFly

class RubberDuck : Duck(), IFly{

    override fun performFlying() {
        println("I don't fly dude. Take your medicine")
    }
}