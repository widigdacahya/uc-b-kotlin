package com.cahyadesthian.also

fun main(args: Array<String>) {

    AwesomePhone().apply {
        speed = 8000
        battery = 4500
        play()
    }
        .also {
            println()
            println("pssst ----")
            println("There is phone started")
            println("Its baterry is ${it.battery}")
        }


    print("\n")
    var cahyaPhone = AwesomePhone()
    cahyaPhone.apply {
        speed = 9000
        play()
    }.also {
        println()
        println("pssst ----")
        println("There is phone started")
        println("Its baterry is ${it.battery}")
    }

    println()
    AwesomePhone().apply {
        speed = 99000
        battery = 4000
        play()
    }.also { newPhone ->
        println()
        println("pssst ----")
        println("There is phone started")
        println("Its baterry is ${newPhone.battery}")

    }

}

/*
*
* Used for performin some additional actions on an object
*
* Common use case is adding some actions tht dont affect
* the object such as logging or debugging information
*
* Removing an also block should not affect the exceutution of a program
* */

class AwesomePhone() {
    var speed = 9000
    var battery = 5000

    fun play() {
        println("Starting phone with speed $speed and battery $battery")
    }
}
