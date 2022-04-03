package CaseStudy

import CaseStudy.InterfaceClass.EngineeInterface
import CaseStudy.InterfaceClass.StorageInterface
import CaseStudy.InterfaceClass.Vehicle

class ClassCar<T>(private val engine : EngineeInterface?, private val storage: StorageInterface<T>): Vehicle<T> {
    override fun accelerate() {
        engine?.move()
    }

    override fun brake() {
        TODO("Not yet implemented")
    }

    override fun refill(source: T) {
        storage.fill(source)
    }
}