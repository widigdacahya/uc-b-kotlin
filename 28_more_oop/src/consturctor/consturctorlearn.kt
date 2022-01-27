package consturctor

/**
 * Constructor
 * Define a set of variable that are available at the creation of object
 * */

fun main(args: Array<String>) {
    //var myChevy = Car("Chevy", 900)

    val car1 = Car()
    val car2 = Car("Nissan Grand Livina")
    val car3 = Car("Chevy", 900)
}

//class Car(var model: String, var topSpeed: Int) {
//
//}

    /*
    * Class can have multiple ways
    * of being created
    * multiple consturoctor not declared at first
    *
    * IF we only have one constructor use model above
    * the mode that consturcotr in parameter
    * */
//here with some cosntructor

class Car {

    var model:String? = null
    var topSpeed = 100

    constructor() {
        model = "NoModel"
        topSpeed = 150
        println("Brmmm a Car with speed $topSpeed")
    }

    constructor(carModel:String) {
        model = carModel
        topSpeed = 150
        println("A $model car, can run until $topSpeed")
    }

    constructor(carModel: String, theTopSpeed: Int) {
        model = carModel
        topSpeed = theTopSpeed
        println("The Car $model is fast, speed up to $topSpeed")
    }


}