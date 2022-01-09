fun main(args: Array<String>) {
    val hasEggs = true
    val hasBacon = false
    val eggCost =5
    val packBacon = 20
    var spent: Int? = 0

    if(hasEggs) {
        spent = 12*eggCost
        println("Got Eggs")

        if(hasBacon) {
            println("Find bacon")
            spent += (2*packBacon)
        }

    } else {
        println("Didnt find any eggs :" )
    }


    println("Have spent $spent")

}