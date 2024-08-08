package entities

import interfaces.IFly

open class Duck : IFly {

    fun swim() {
        println("I'm swimming")
    }

    fun quack() {
        println("Quack!")
    }

     override fun performFlying() {
        println("I'm flying, helll noooo");
    }

}