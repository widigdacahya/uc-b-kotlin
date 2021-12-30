fun main(args: Array<String>) {
    println("Input a Number :")

    // ?:"" to handle or avoid empty value so it mean whenever input is nothing it gonna filled by what on ""(default value)
    val userInputNumber = readLine()?:""
    println("You wrote: ${userInputNumber.toInt()}")
    println("That value if multiply by 2 is ${userInputNumber.toInt() * 2}")
}