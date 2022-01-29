fun main(args: Array<String>) {

    val theFactory = CarFactory()

    var iNeedACar:Car = theFactory.makeCar()

    iNeedACar.speed = 200
    iNeedACar.drive()
    iNeedACar.park()

}

/*
* a Car can drive and park, it has speed
*
* a chevy implement car
*
* a car factory make cars
*
* myCar asked from factory and it functioned like car
*
* */


interface Car {
    fun drive()
    fun park()

    var speed: Int
}

class Chevy: Car{
    override fun drive() {
        println("Chevvy on the way with $speed kmh")
    }

    override fun park() {
        println("Chevvy arrive, parked it!")
    }

    override var speed = 180

}

class CarFactory {
    fun makeCar(): Car {
        return Chevy()
    }
}