package Arrays

import OOP.Movable

class Car: Movable {
    override var speed: Int = 60

    override fun move() {
        println("Машина едет со скоростью $speed км/ч")
    }
}

class Aircraft: Movable {
    override var speed: Int = 600

    override fun move() {
        println("Самолет летит со скоростью $speed км/ч")    }

    override fun stop() {
        println("Приземление")
    }
}

fun main(){
    val m1: Aircraft = Aircraft();
    val m2: Car = Car()

    m1.move()
    m1.stop()

    m2.move()
    m2.stop()
}