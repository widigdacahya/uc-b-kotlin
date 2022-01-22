fun main(args: Array<String>) {
    val randNum = listOf(1,3,5,7,9,2,4,6,8,10,12,56,21,14,899,124,25,124,325,124,124,3255,235235,12,44)
    val theSubset = randNum.map {
        if (it%2==0) it/2 else it*2
    }.filter { it>25 }
    println("first number is $randNum")
    println("after cond apllied $theSubset")
}

/**
 * Given collection of random integers
 * If a number is odd, double it
 * If number is even, half it
 * Print out a subset of the collection that has numbers
 * greater than 25
 * */
