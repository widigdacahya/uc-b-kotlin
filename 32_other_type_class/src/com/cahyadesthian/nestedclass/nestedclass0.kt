package com.cahyadesthian.nestedclass

/*
* ENCAPSULATE FUNCTIONALITY
*
* */

fun main(args: Array<String>) {

    val firstBike = Motorcylce()
    firstBike.Engine().runEngine()

    println()
    val newChevy = MyChevyCar()
    newChevy.driveMyChevy()

}

/*
* simply a class created inside another class
*
* Inner class can access variables and method of outer class
* using this@
* */

class Motorcylce {
    var speed = 320

    fun drive() {
        println("A motor cycle drive with speed $speed")
    }

    inner class Engine{
        var rpm = 250
        fun runEngine() {
            println("The engine run at $rpm")
            this@Motorcylce.speed = 350
            this@Motorcylce.drive()
        }
    }

}

/*
* Outer class can create instance
* of inner class
* use this for hiding
* */

class MyChevyCar {
    var speedMyChevy = 600

    fun driveMyChevy() {
        engineSpecialChevy.runChevySpecialEngine()
        println("Driving the Chevy Car with aweosme speed $speedMyChevy")
    }

    private var engineSpecialChevy = myChevyEngine()

    private inner class myChevyEngine() {
        var rpm = 1200
        fun runChevySpecialEngine() {
            println("Running Chevy SPecial Egnine at $rpm rpm")
            this@MyChevyCar.speedMyChevy = 800
        }
    }

}
