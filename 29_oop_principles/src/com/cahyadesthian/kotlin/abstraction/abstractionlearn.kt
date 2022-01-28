package com.cahyadesthian.kotlin.abstraction

/*
* ABSTRACTION
* a common feature
* of 2 classes should be abstraacted in a third class
* */

fun main(args: Array<String>) {
    val aContainer = Bottle()
    aContainer.pour()

    val aJug = Jug()
    aJug.pour()
}

abstract class Container {
    fun pour() {
        println("Pouring Liquid")
    }


}

class Bottle: Container() {
    fun fill() {
        println("Filling Bottle")
    }
}

class Jug: Container() {

}