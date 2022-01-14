fun main(args: Array<String>) {
//    for(i in 1..3) {
//        println("Input a number")
//        var inp1 = readLine()?:""
//
//        println("Input second number")
//        var inp2 = readLine()?:""
//        var num1 = inp1.toDouble()
//        var num2 = inp2.toDouble()
//        println("The sum of $num1 and $num2 us ${sumTwoNumber(num1, num2)}")
//    }


    val products = hashMapOf(Pair("shoes",29.99), Pair("socks", 5.99), Pair("jeans",39.99))
    for(item in products.keys) {
        println("Yhe final price of $item is ${prodPrice(products[item])}")
    }

}

fun sumTwoNumber(numOne: Double, numSec : Double) : Double = numOne+numSec

fun prodPrice(price: Double?): Double? {
    val tax = 0.2
    return price?.plus(price?.times(0.2))

}