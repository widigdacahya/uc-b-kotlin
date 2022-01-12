fun main(args : Array<String>) {
    for(i in 1.. 10) {
        println("#$i Hi hello whats up!")
    }

    var sum = 0
    for (j in 1..100) {
        sum += j
        println("Now j is $sum")
    }

    /**
     * An online stoire has follwoing map of customer and
     * number of pirchase
     *
     *
     * for each customer, print out a message
     * telling them hown many thing they bought
     * */

    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna",6))
    for(custorName in customers.keys ) {
        val purchase = customers[custorName]
        println("$custorName have purchased $purchase items")
    }

}