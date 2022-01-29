/*
*
* Similiar with abstrac clas
*
* Interface is definiton of a parti of a class
*
* it told us what class/object able to do
*
* Object can access other object thorugh their interfaces
*
* can be used as variable type
*
* */

fun main(args: Array<String>) {

    val defaultOven: Oven? = null
    defaultOven?.turnOn()
    defaultOven?.cook(100)

    val boshOven: Oven = Bosch()
    boshOven.turnOn()
    boshOven.cook(200)
    boshOven.turnOff()

    val companyOven:Oven = getOven()
    companyOven.turnOn()
    companyOven.cook(400)
    companyOven.turnOff()

}

/*
* Usualy only declare a function(without implementaition)
* so usually we eill not see variable and function implemention in the interface
* but we could do such at thing
* */
interface Oven {
    val temperature: Int

    fun turnOn()

    fun turnOff()

    fun cook(temp: Int) {
        println("Cooking at $temp degree with max normaly $temperature")
    }
}


class Bosch: Oven {
    override val temperature: Int = 180

    override fun turnOn() {
        println("Turning On Bosch")
    }

    override fun turnOff() {
        println("Turning Off Bosch")
    }

}


fun getOven(): Oven {
    return Bosch()
}