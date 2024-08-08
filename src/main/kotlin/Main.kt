import entities.*

fun main(args: Array<String>) {

//    println("normal duck:")
//    var normalDuck = Duck().also {
//        it.quack()
//        it.swim()
//        it.performFlying()
//    }
//
//    println("\ntheWildDuck:")
//    var theWildDuck = WildDuck().also {
//        it.quack()
//        it.swim()
//        it.performFlying()
//        it.bite()
//    }
//
//    println("\nrubberDuck:")
//    var rubberDuck = RubberDuck().also {
//        it.performFlying()
//    }


    var myFirstDuck = NewDuck(FlyWithBaloon())
    myFirstDuck.performFlying()

    myFirstDuck.changeFlyType(FlyNoWay())


}