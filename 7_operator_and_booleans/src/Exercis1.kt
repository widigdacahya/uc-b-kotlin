fun main(args: Array<String>) {
    var a = 75.254
    var b = 3.867

    println("We have a = $a and b = $b , so if we do some operation to it:")
    println("Addition = ${a+b}")
    println("Subtraction = ${a-b}")
    println("Multipilication = ${a*b}")
    println("Division = ${a/b}")
    println("Remainder = ${a%b}")

    // Second question
    val kiloPriceMeat = 29.99
    val purchaseAmount = 1/3f
    val totalPrice = "You need to pay ${kiloPriceMeat*purchaseAmount}"
    println(totalPrice)

    //third question
    println("enter amount in your bank account: " )
    var userHave = readln()?:""
    var amount = userHave.toDouble()
    println("Congrats, you win and now your account become ${amount*3}")

}