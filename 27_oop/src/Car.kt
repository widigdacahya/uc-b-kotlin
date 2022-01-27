/**
 *
 * class is blueprint for componentns(object)
 * class has
 * >variable
 * >method(function)
 * Naming convention start with capital letter
 *
object is an instance of a class
onject can change its value without impacting other object from the same class
object called in main function
 * */

class Car {

    var model: String? = null
    var topSpeed = 150

    fun start() {
        println("Turn On the $model")
    }

    fun drive(speed:Int) {
        println("Driving with speed $speed")
    }

}


fun main(args: Array<String>) {
    val myCar = Car()
    val herCar = Car()

//    println(myCar)
//    println(herCar)

    myCar.model = "Chevy"
    herCar.model = "Nissan"

    myCar.start()
    myCar.drive(100)

    herCar.start()
    herCar.drive(132)

}