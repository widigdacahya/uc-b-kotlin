fun main(args: Array<String>) {
    val catName = "My Cat's Name is \"Fluffy\""
    println(catName.length)
    println("The catName variable is \" $catName \" length is ${catName.length}")

    //Extract String car
    var myCar = "My Car won't start"
    println(myCar.substring(3,6))

    var clientName = "Cahyadesthian"
    println("Congratulation $clientName on everything that you had achieved")

    val apples = 4
    val oranges = 7

    println("Total fruit is ${apples+oranges}")


}