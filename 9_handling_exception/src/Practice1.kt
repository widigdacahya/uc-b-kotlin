import java.lang.Exception

fun main(args: Array<String>) {


    /*
    * Read data from the console and convert into a number
    *
    * if possible, multiply it by 5 and print
    *
    * if an exception ooccur, catch and print meaningful meessage
    *
    * */

    //number 1
//    print("Hey, type anumber pls : ")
//    var userInput = readLine()
//
//    try {
//        println("Your input is $userInput . if it multiplied by 5 is ${userInput?.toDouble()?.times(5)}")
//    } catch (e:Exception) {
//        println(" your input $userInput was not a number")
//        e.printStackTrace()
//    } finally {
//        println("Thank you for having us")
//    }

    // Questoin 2
    print("Please enter the distance that you think you could achieve today(in Km): ")
    val distanceInput = readLine()
    try {
        println("In mile, your distance is ${distanceInput?.toDouble()?.times(0.62)} miles")
    } catch (e:Exception) {
        println("Cant determine your input $distanceInput")
        e.printStackTrace()
    }

}