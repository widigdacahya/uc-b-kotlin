package com.cahyadesthian.apply

/**
 * can be used to apply some functionality and return a result
 *
 * Return the initial object
 *
 * common use case is applying configuration to an object creation
 *
 * */

fun main(args: Array<String>) {

    val myBlackCar = theAwsmCar().apply {
        speed = 4000
        color = "Dove Black"
    }

    myBlackCar.turnOnCarr()

    //return the object
    println(myBlackCar)

}

class theAwsmCar {
    var speed = 0
    var color = "black"

    fun turnOnCarr() {
        println("Turnnin the $color car with speed $speed")
    }
}