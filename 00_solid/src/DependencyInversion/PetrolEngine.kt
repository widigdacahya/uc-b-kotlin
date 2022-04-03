package DependencyInversion

/**
 * Kind of low level class
 * */
class PetrolEngine : EngineInterface {
    override fun start() {
       println("Need some flexubilty? here it is Petrol Car on")
    }
}