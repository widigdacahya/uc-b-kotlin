fun main(args: Array<String>) {
    println("Input a number, plz :" )
    var userNumber = readLine()?:""
    var doubleCreated = 1.5
    var multipliedNumber = userNumber.toInt() * doubleCreated
    println(multipliedNumber::class.java)
}