package entities

import interfaces.IFly

class NewDuck(var fly: IFly) : Duck() {

    override fun performFlying() {
        this.fly.performFlying()
    }

    fun changeFlyType(newFlyType: IFly)
    {
        newFlyType.performFlying()
    }

}