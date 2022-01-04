fun main(args: Array<String>) {

    /*
    * A customer will tell the program what product they want to buy
    *
    * they will tell the program how many product they require
    *
    * assume the price of product is 9.99
    *
    * what is the total
    *
    * Handle exption thath might be occur
    * */

    println("What produt you want to buy?")
    var userInputProduct = readLine()

    println("How many would you like to get? ")
    var userAmount = readLine()
    //println(userAmount?.toInt())

    var produtPrice: Float = 9.99F

    try {
        println("You buy $userInputProduct that has price of $produtPrice and you buy ${userAmount?.toInt()} of it")
        println("So you need to pay ${userAmount?.toInt()?.times(produtPrice)}")
    } catch (e: Exception) {
        println("Some input may not true")
        e.printStackTrace()
    } finally {
        println("Ku terbiasa tersenyum terang")
    }

}