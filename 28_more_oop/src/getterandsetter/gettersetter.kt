package getterandsetter

fun main(args: Array<String>) {
    var whoseCar = WeirddCar()
    whoseCar.name = "New Arrived Car"
    whoseCar.speed = 9000
    println("Name : ${whoseCar.name} | Speed : ${whoseCar.speed}")
    /*
    * The OUTPUT will look like
    * Name : High speed car 9000 | Speed : 50
    *
    * */
}

/**
 * GETTER AND SETTER
 *
 * allow us to change the way variables are assigned and retrieved
 *
 * if we define a custim getter or setter
 * it would be called every time we access the variable
 *
 * */
class WeirddCar {
    var name = ""
        //get() = "Chevy"


    var speed: Int = 0
        get() = 50
        set(value) {
            name = "High speed car $value"
            field = value
        }
}

