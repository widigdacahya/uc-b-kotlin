fun main(args: Array<String>) {

    /*
    * A product cost 29.99
    *
    * Ask a user at the console how many product they want to buy
    *
    * If the read value is null, use the dafault of one
    *
    * Print total purchase
    * */

    //var productCost = 29.99
    //println("Something you but cost $29.99, how many you would to buy? : ")
    //var howmNayUserbuy = readLine()
    //var processInput: Double? = howmNayUserbuy?.toDouble()?:1.0
    //println("Your total purchase is ${processInput?.times(productCost)}")

    /*
    * Versi KJ
    * */

    val productPrice = 29.99
    println("How Many Product would you like to buy?")
    val input = readLine()
    val purchasedProduct = input?.toInt()?:1
    println("Total is ${purchasedProduct*productPrice}")

}