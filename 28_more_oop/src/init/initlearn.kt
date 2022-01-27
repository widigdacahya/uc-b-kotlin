package init

fun main(args: Array<String>) {
    val newCarArrived = theCar()
}

/*
*
* "init" block is run before any other code in the class
*
* Provide functionality  in additon to the primary constructor
*
* */

class theCar{
    var model = "Chevy"
    var topSpeed = 120

    init {
        println("The default car id $model with speed max is $topSpeed")
    }

}