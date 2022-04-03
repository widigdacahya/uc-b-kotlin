package CaseStudy

import CaseStudy.InterfaceClass.EngineeInterface

class ElectricEnginee(
    private val speedController: SpeedController
) : EngineeInterface {

    override fun move() {
        speedController.control()
    }

}