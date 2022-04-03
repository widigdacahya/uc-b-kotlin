package DependencyInversion


/**
 * Kind of low level class
 *
 */

class DieselEngine: EngineInterface {
    override fun start() {
        println("Diesel Car is Friendly")
    }
}