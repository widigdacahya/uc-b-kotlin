fun main(args: Array<String>) {

    val myDeckCard = hashSetOf(2,6,7,10)
    var herDeckCard = setOf(1,2,7,10)

    println(myDeckCard.retainAll(herDeckCard))
    println("so my deck was $myDeckCard") //it print the resul of the retain

    println(myDeckCard.clear())
    println(myDeckCard)

}