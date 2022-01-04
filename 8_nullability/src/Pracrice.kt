fun main(args: Array<String>) {
//    println("input a message")
//    val message = readLine()
//    println(message?:"Hi, how was your day")

    println("Input a number : ")
    var input = readLine()
    var number = input?.toDouble()
    println("$number multiplied by 5 is ${number!! * 5}")
    //println("$number multiplied by 5 is ${number?.times(5)}")
    //number = null
    //println("$number multiplied by 5 is ${number?:1.times(5)}")
}