fun main(args: Array<String>) {
    print("Input a Number plz : ")
    var userInputNumber = readLine()?:""
    var convertedInput = userInputNumber.toDouble()
    var pi = 4.14159
    println("Your Number multiplied by var pi that has value is $pi is ${convertedInput * pi}")

}