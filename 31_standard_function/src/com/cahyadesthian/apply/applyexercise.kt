package com.cahyadesthian.apply

fun main(args:Array<String>) {
    print("Enter your name plz, get spcl coffee : ")
    var clientNameThatBuyCoffee = readLine()?:""
    CoffeeAwesomeShop().sellCoffee(clientNameThatBuyCoffee)
}


class CupOfDeliciousCoffee {

    var clientName : String? = ""

    fun prepareMostDeliciousCoffee() {
        println("A Special Coffee for $clientName")
        println(this)
        println()
    }

}

class CoffeeAwesomeShop {
    fun sellCoffee(awsmNameOfClient: String) {

        // with or without var it still printed
        var someCoffee = CupOfDeliciousCoffee().apply {
            clientName = awsmNameOfClient
            prepareMostDeliciousCoffee()
            println("Serving with heart to $awsmNameOfClient <3")
            println(this)
            println()
        }

        println("This someCOffe var")
        println(someCoffee)
    }
}