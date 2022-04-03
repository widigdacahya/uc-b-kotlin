package DependencyInversion


/**
 * It is kind of high level class
 * */
class Car(private val engine: EngineInterface) {
    fun startCar() {
        engine.start()
    }
}