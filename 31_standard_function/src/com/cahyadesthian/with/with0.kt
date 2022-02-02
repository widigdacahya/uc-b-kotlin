package com.cahyadesthian.with

/**
 *
 * Perform a block code on an object
 *
 * Context is available as 'this' ( 'this' keyoword can be omitted )
 *
 * can access object variable and method
 *
 * Typical use case
 * > perform some intialization on an object
 * > perform sequnce of actions on an object
 *
 * */

fun main(args: Array<String>) {
    with(Car()) {
        speed = 190
        drive()
        println("Wuuuuiing driving fast")
    }


    println()

    with(Car()) {
        println("Another Car")
        speed = 900
        drive()
    }
}


class Car {
    var speed = 90

    fun drive(){
        println("Drivin with speed $speed")
    }
}