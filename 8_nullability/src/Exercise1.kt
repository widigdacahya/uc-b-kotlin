fun main(args: Array<String>) {
    /*
    * Read number from console, conver it to Double
    * multiply it by 7, convert into a string
    * print the length of the string
    * */

    print("Yow, please inpu a number : ")
    var userInput = readLine()
    var userInputProcesing: Double? = userInput?.toDouble()
    var mulBySeven = userInputProcesing?.times(7)
    var resToString = mulBySeven.toString()
    println("The lenght of $resToString is ${resToString?.length}")
}