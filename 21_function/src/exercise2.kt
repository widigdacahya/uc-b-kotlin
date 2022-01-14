fun main(args: Array<String>) {

    println()
    println("Yow we could print lifespan of animal")
    println("Input a kind of animal: ")
    var userInp = readLine()?:""
    println("The $userInp life span is ${inpAnmil(userInp)}")

}
/**
 * a function that receives name of animal, return
 * estimated lifespan
 *
 * ask user to input the animal, and print out the estimated lifespan
 * */

fun inpAnmil(animalKind: String?) : Int? {
    var lifespanAnimal= when(animalKind) {
        "cats" -> 15
        "dogs" -> 10
        "rabbit" -> 12
        else -> 20
    }
    return lifespanAnimal
}