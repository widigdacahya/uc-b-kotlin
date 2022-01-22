fun main(args: Array<String>) {

    /**
     * For Each
     * apllied to a collection
     * */

    val client = listOf("Prameswari", "Cahyadewi", "Puspaningtyas", "Embun", "Binar")
    client.forEach{ println("Hello $it , have a great day") }


    /**
     * Filter
     * return a collection that pass a predicat
     * */
    println()
    client.filter{ it.length > 5}
        .forEach { (println("$it your name is awesome and more than 5 char")) }


    /**
     * Map
     * create new collection based on lambda/predicat
     * */
    println()
    val sizeClientName = client.map { it.length}
    println("the map is $sizeClientName")

    println()
    for(i in 0..client.size-1) {
        print("${client[i]} has length ${sizeClientName[i]}\n")
    }


    /**
     * Sorted by
     * define a way to sort a list
     * */
    println()
    val sortedCLient = client.sortedBy { it.length }
    println("Sorted : $sortedCLient")

    /**
     * maxBy
     * max length of given element
     * */
    println()
    val maxClientName = client.maxByOrNull{it.length}
    println("the maximum client name is $maxClientName")

    /**
     * minBy
    * **/
    println()
    val minClientName = client.minByOrNull { it.length }
    println("THe min char name of clients is $minClientName")


}

