fun main(args: Array<String>) {

    var peopleWannaGo : theCar = rentalPlace().rentASafeCar()
    peopleWannaGo.driveYou()

    println()
    peopleWannaGo = rentalPlace().rentLimo()
    peopleWannaGo.driveYou()

}

interface theCar {
    fun driveYou()
}

class safeAndComfortCar : theCar {
    override fun driveYou() {
        println("Driving you to the destination")
    }

}

class limoCar : theCar {
    override fun driveYou() {
        println("Driving you to the destination | allso with luxurious look and stylish")
    }

}

class rentalPlace {

    fun rentASafeCar(): theCar {
        return safeAndComfortCar()
    }

    fun rentLimo() : theCar {
        return limoCar()
    }

}