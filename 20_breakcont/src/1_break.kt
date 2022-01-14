fun main(args: Array<String>) {
    val onlyEvenNumber = listOf(0,2,4,6,7,8)
    for(number in onlyEvenNumber) {
        if(number%2 == 0 ) {
            println("$number is even checked")
        } else {
            println("there is $number")
            break
        }
    }
}