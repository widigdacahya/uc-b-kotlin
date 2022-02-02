package com.cahyadesthian.run

fun main(args: Array<String>) {

    run {
        var myLaptop = Laptop()
        myLaptop.protocol()
    }

}

class Laptop {

    fun turnOff() {
        println("Laptop : Turning OFF")
    }

    fun turnOn() {
        println("Laptop : Turnin ON")
    }

    fun protocol() {
        turnOff()
        turnOn()
    }

}