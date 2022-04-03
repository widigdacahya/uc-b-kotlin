package DependencyInversion

fun main(args: Array<String>) {

    val dieselEngine = DieselEngine()
    val dieselCar = Car(dieselEngine)

    val hybridEgine = HybridEgine()
    val hybridCar = Car(hybridEgine)

    val petrolCar = Car(PetrolEngine())

    dieselCar.startCar()
    hybridCar.startCar()
    petrolCar.startCar()

}