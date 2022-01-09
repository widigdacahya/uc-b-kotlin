fun main(args: Array<String>) {
//    var night = true
//
//    if(night) {
//        println("Sleep")
//        night = false
//    } else {
//        println("be active")
//        night = true        //this wouldnot infinite loop
//    }
//
//    println("\nHeyo, what time is it on your place, is it Night?")
//    var timeInput = readLine()?:"false"
//    var isItNight = timeInput.toBoolean()
//
//    if(isItNight) {
//        println("Malem, get some sleep")
//    } else {
//        println("wiii, its a good day")
//    }

    var clientFunds = 100
    val price = 50
    var clientProduct = 0

    if (clientFunds > price) {
        clientFunds -= price
        clientProduct+= 1
        println("Youve got the thing, now you have $clientProduct product, you have $clientFunds")
    } else {
        println("Sorry, insufficient funds")
    }

}