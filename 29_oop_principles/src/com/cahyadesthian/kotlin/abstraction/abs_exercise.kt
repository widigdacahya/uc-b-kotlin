package com.cahyadesthian.kotlin.abstraction

fun main(args:Array<String>) {

    val myOven = BoschOven()
    myOven.cookingSomethin()


    val myRoaster = Roaster()
    myRoaster.cookingSomethin()

}

abstract class Oven {
    open var cookingSpeed = 120
    open var avgTemp = 180

    abstract fun cookingSomethin()
}

class BoschOven: Oven() {

    override var avgTemp: Int = 210

    override fun cookingSomethin() {
        println("Bosch Oven is cooking | speed $cookingSpeed | avg. temp $avgTemp")
    }

}

class Roaster: Oven() {



    override fun cookingSomethin() {
        println("Roaster roast at | speed $cookingSpeed | avg. temp $avgTemp")
    }

}