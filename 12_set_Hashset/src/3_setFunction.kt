fun main(args: Array<String>) {

    val cardNumber = setOf(2,3,4,3)
    println(cardNumber.size)  // it printed 3, so duplicated element count 1

    val someoneName = setOf("Padmasari", "Hapsari", "Indraswari", "Kayshilla", "Nindita")
    println( someoneName.contains("Indri"))

    val aNumber = setOf(4,5,9,8,7,2,12,12,14)
    println(aNumber.containsAll(setOf(45,1,2,3)))

    val numberSet = hashSetOf<Int>(45,12,32,45,987,156)
    println("numberSet before remove " + numberSet)
    numberSet.removeAll(numberSet)
    println("numberSet after removal " + numberSet)

}