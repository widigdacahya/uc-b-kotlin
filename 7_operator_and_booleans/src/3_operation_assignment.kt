fun main(args: Array<String>) {
    /**
    * 1. assigment ( = )
     *
     *
     *
    * 2. Reference ( $ )
     *
     *
     *
     *
    * 3. Referece Expression ( ${ } )
     * */

    // assigment
    val dozen = 12
    val month = dozen
    println("I was realize that dozen is same amount with month, that is $month")


    // Reference
    val userName = "Cahyadesthian"
    val greeting = "Hello $userName"
    println( greeting )

    // reference expression
    val product = 3
    val price = 569.3
    val totalPrice = "Total ypu need to pay is ${product*price}"

    println(totalPrice)
}