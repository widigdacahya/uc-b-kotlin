package Inheritance

fun main(args:Array<String>) {

    val myLap = Laptop()
    val mySecLap = Apple()

    mySecLap.screenSize = "FHD"
    mySecLap.speed = 10
    mySecLap.name = "appy"

    myLap.run()
    mySecLap.run()

}

/**
 *
 * */

open class Laptop {
    var screenSize = "HD"
    var speed = 8
    var name = "Gen Lapy"

    fun run() {
        println("THe laptop $name run with speed $speed and screen size $screenSize")
    }
}

class Apple: Laptop() {

}