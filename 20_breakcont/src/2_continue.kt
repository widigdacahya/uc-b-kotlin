fun main(args: Array<String>) {
    /**
     * Continue to prcoeed to the next step of the loop
     * skip curent step and proceed to the new step
     * */
    val onlyEvenNumber = listOf(0,2,4,5,6,7,8,10,12,14)
    for(num in onlyEvenNumber) {

        if(num%2 != 0) {
            continue
        } else {
            println("$num is even")
        }

    }
}