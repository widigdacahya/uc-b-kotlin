fun main(args: Array<String>) {

    /*
    * There is map,
    * need to print some,add,print again
    *
    * */
    var count = hashMapOf(Pair(1,"un"), Pair(2,"deux"), Pair(3, "trois"))
    println("Translate of two on number french is ${count[2]}")
    println("Translate of two on number french is ${count.get(2)}")
    println("Translate of three on number french is ${count[3]}")

    print("\n")
    println("Need to add translation  of 4")
    count.put(4,"quatre")
    println("Now our map is $count")


    /*
    * There is map of customer with how many product they have bought
    *
    * */
    var customers = mapOf(Pair("John", 2), Pair("Alice",15), Pair("Bob",3))
    println("our Customer codition : $customers")
    println("........")
    println("Is Alice a Customer, How many produt did she buy?")
    println("The answer is ${customers.containsKey("Alice")} , and she bought ${customers.get("Alice")} products")
    println("....")

}