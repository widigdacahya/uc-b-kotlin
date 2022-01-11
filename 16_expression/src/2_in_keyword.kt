fun main(args: Array<String>) {
    /**
     * for collection and range
     *  > colection like list,Map,set
     *  > range is like 1..10 (read 1 to 10)
     * */

//    val favPet = "cat"
//    val availablePet = arrayListOf("dog","cat","camel")
//
//    if(favPet in availablePet) {
//        print("We have your best friend")
//    } else {
//        println("Sorry, $favPet was not here")
//    }
//
//    println()
//    print("Enter your prefered coffe: ")
//    val coffee = readLine()?:""
//    val ourStock = listOf("cappuccino","mocha")
//    if(coffee !in ourStock)
//        println("Sorry $coffee not available")
//    else {
//        println("Here yours")
//    }

    println()
    print("Please enter a number: ")
    val input = readLine()?:"0"
    var numberUser = input.toInt()
    if(numberUser !in 0..9) println("A single digit plz") else println("thank you")

}