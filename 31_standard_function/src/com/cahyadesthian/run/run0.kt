package com.cahyadesthian.run

/*
*
* Same as with but invokes as an extension function
* Useful when need lambda that return result
* Can be used to mlimit the scope
*
* */

fun main(args: Array<String>) {

    Bike().run {
        speed = 40
        driveBike()
        println("Ride first no var bike")
    }

    println()
    var mioZ = Bike().run {
        speed = 60
        driveBike()
        println("Mio Z wiii")
    }
    println(mioZ)

    println()
    var mioS = Bike().run {
        speed = 40
        driveBike()
        println("Mio S sliim")
        this
    }
    println(mioS)


    /*
    as direct function
    only in theses scope
    */
    println()
    run {
        var beat = Bike()
        beat.speed = 100
        beat.driveBike()
    }

}

class Bike {
    var speed = 900
    fun driveBike() {
        println("Driving a bike with speed $speed")
    }
}