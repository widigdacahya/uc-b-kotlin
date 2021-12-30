fun main(args: Array<String>) {
    //1. ask name and output it
    println("What is your name?")
    var userName = readLine()
    println("Hello, welcome $userName")

    //2. ask number and print it multiply by 5
    println()
    println("Please enter a number, we will multiply it by 5 :) ")
    val userNumber = readLine()?:""
    println("Your number is $userNumber , and if it multiply by 5 is ${userNumber.toInt()*5}")


    //3. ask user birthyear and estimate age
    println()
    println("We gonna estimate your age, enter your birt year: ")
    val yearInput = readLine()?:""
    val thisYear = 2021
    println("Your age is ${thisYear- (yearInput.toInt())}")
}