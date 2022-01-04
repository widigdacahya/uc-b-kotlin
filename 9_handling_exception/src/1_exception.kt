fun main(args: Array<String>) {

    /*
    * Exception is an unexpected event in a program
    * System can't revocer by it selft dfrom an excepton
    *
    * when execution is topped(because of expcetion), the data wil lost
    *
    *  Exception have a message
    *
    * A stacktrace, a log of what the program did before it reached this point
    *
    * optionally a cause
    * */

    //example Exception
    val userInput = readLine()
    println("User Input is ${userInput?.toInt()}")  //it would exception if we input a string ti userInput

}