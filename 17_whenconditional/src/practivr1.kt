fun main(args: Array<String>) {

    /**
     * Numbr 1
     *
     * assume that 3 meas a day is recommended ammount
     *
     * ask user input number meals they had
     *
     * based on input, print message to decrease or
     * incerase they meals
     * */

    println("Number 1")
    print("How many melas a day that you do ? ")
    var input = readLine()?:"3"
    val inputNum = input.toInt()
    val meals = when(inputNum) {
        in 1..2 -> print("Should meal more :D")
        3 -> println("Awesome")
        else -> println("Wuuu You sholud eat less")
    }

    println()
    println("Number 2")
    print("I ask your hour digit man :) : ")
    val inpUser = readLine()?:"0"
    var userInptInt = inpUser.toInt()
    var msg = when(userInptInt) {
        in 6..11 -> "Mowinng"
        in 12..14 -> "Noown"
        in 15 ..17 -> "Afternoown"
        in 18..21 -> "Evening"
        in 22..24,in 0..5 -> "Night"
        else -> "What a day"
    }

    println("Your hour is $userInptInt and that is $msg")
}