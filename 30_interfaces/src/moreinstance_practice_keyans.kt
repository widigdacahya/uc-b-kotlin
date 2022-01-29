fun main(args: Array<String>) {

    val therIsCarHouse = CarHouse()

    var peopleNeedCar : RentalCar = therIsCarHouse.rentLimoCar()
    peopleNeedCar.rentToDriveYou()

    println()
    peopleNeedCar = therIsCarHouse.rentSafeCar()
    peopleNeedCar.rentToDriveYou()


}

interface RentalCar {
    var rentPrice: Int
    fun rentToDriveYou()
}

class SafeAndComfortCar: RentalCar {
    override var rentPrice: Int = 100


    override fun rentToDriveYou() {
        println("The Safe and Comfortable Car will drive you Sir. Offer : $rentPrice")
    }

}

class LimoCar: RentalCar {
    override var rentPrice: Int = 500

    override fun rentToDriveYou() {
        println("The Limo would accompany you in luxurious style. Offer : $rentPrice")
    }

}

class CarHouse {
    fun rentSafeCar(): RentalCar {
        return SafeAndComfortCar()
    }

    fun rentLimoCar(): LimoCar {
        return LimoCar()
    }
}