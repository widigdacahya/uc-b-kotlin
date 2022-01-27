package ClassesAndObject

/***
 * in KOtlin, everything is object
 *
 *
 *
 */

fun main(args: Array<String>) {
//    val animal = listOf("Cat", "Dog", "Fish", "Bird")
//    println(animal.size)

    val table = Table()
    println(table.color)


    val myGarage = Garage()
    myGarage.car.drive()
}


/**
 * Object definition(cllasses) can contain references to other object
 *
 * */
class Table {
    var color: String = "White"
}

class MyCar {
    fun drive() {
        println("Driving alon in my car")
    }
}

class Garage {
    val car = MyCar()
}