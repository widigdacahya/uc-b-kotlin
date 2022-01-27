package Inheritance

fun main(args: Array<String>) {

    var boeing737 = Boeing()
    var a320 = Airbus()

    boeing737.name = "Boeing Garuda 1000"
    boeing737.speed = 5500

    a320.name = "A320 airbus"
    a320.speed = 9000

    boeing737.ascend()
    boeing737.ascend()
    boeing737.ascend()

    println()

    a320.descend()
    a320.descend()

}

open class Airplane {
    var speed = 5000
    var altitude = 20000
    var name = "Generic"

    //increase altitude
    fun ascend() {
        altitude += 1000
        println("$name fly with speed $speed and altitude $altitude")
    }

    //decrease altitude
    fun descend() {
        altitude -= 1000
        println("$name go down with speed $speed and altitude $altitude")
    }

}

class Boeing: Airplane() {

}

class Airbus: Airplane() {

}