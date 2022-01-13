fun main(args: Array<String>) {
    /**
     * input A large number
     *
     * print all number divisible by 7
     * that less than or equal user's number
     * */

    println()
    print("Input a number : ")
    var userInput = readLine()?:""
    var numberUser = userInput.toInt()
    var whileIdx = 0

    while(whileIdx <= numberUser) {
        if(whileIdx%7==0) {
            println("$whileIdx is div by 7")
        }

        whileIdx++
    }

}