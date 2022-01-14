fun main(args: Array<String>) {

    for(i in 1..10) {
        //printHello()
    }
    mulTwoInp()

}

fun printHello() {
    println("Hellow, hw ar you?")
}

fun mulTwoInp() {
    println("This gonna multiply two num you type.")

    print("Please input first number : ")
    var inpFirs = readLine()?:""
    var firstInpNum = inpFirs.toInt()

    print("Please input second number : ")
    var inpSec = readLine()?:""
    var secNum = inpSec.toInt()

    println("Okey thank for the numbers. $firstInpNum * $secNum = ${firstInpNum*secNum}")
}