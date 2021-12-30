fun main(args: Array<String>) {
    //conversion into a specific type
    var pi = 4.14159
    println("The type of pi variable is ${pi::class.java} and the value is $pi")

    var floatPi = pi.toFloat()
    println("The type of floatPi variable is ${floatPi::class.java} and the value is $floatPi")

    var intPi = pi.toInt()
    println("The type of intPi is ${intPi::class.java} and the value is $intPi")

    var stringPi = pi.toString()
    println("The type of stringPi is ${stringPi::class.java} and the value is  $stringPi")
}