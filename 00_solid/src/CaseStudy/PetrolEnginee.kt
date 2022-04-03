package CaseStudy

import CaseStudy.InterfaceClass.EngineeInterface

class PetrolEnginee(private val oilPipe: OilPipe, private val piston: Piston) : EngineeInterface {

    override fun move() {
        val oil: Oil = oilPipe.suckOil()
        val energy: Energy = oil.burn()
        energy.push(piston)

    }

}