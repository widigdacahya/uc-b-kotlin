package com.cahyadesthian.kotlin.abstraction

fun main(args: Array<String>) {
    val newContainer = Bottles()
    newContainer.pour()

    val secNewContainer = Jugs()
    secNewContainer.pour()
}

abstract class Containers {
    abstract fun pour()
}

class Bottles: Containers() {
    override fun pour() {
        println("Pour from bottler")
    }
}

class Jugs: Containers() {
    override fun pour() {

        println("Pouring from jug")
    }
}