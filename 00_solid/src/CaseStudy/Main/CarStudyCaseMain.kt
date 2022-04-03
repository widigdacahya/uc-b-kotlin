package CaseStudy.Main

import CaseStudy.*
import DependencyInversion.Car

fun main(args: Array<String>) {

    val tank = Tank()
    val oilPipe = OilPipe()
    val piston = Piston()
    val petrolEnginee = PetrolEnginee(oilPipe, piston)

    val petrolCar = ClassCar<Oil>(petrolEnginee,tank)

    val oil = Oil()

    petrolCar.refill(oil)
    petrolCar.accelerate()
    petrolCar.brake()



    val electrons = Electrons()
    val battery = Battery(electrons)
    val speedController = SpeedController(BatteryManagementSystem(), ElectricMotor())
    val electricEnginee = ElectricEnginee(speedController)
    val electricCar = ClassCar<Electrons>(electricEnginee, battery)

    electricCar.refill(electrons)
    electricCar.accelerate()
    electricCar.brake()
    
}