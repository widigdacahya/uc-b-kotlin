fun main(args: Array<String>) {

    //the variable itself didnt change, so we need to assign to a new variable
    var aNumberOfCatsIWant = 8
    println(aNumberOfCatsIWant::class.java)
    var longANumberOfCatsIWant = aNumberOfCatsIWant.toLong()
    println("Type of aNumberOfCatsIWant : ${aNumberOfCatsIWant::class.java} , the value is $aNumberOfCatsIWant")
    println("Type of longNumberOfA CatsIWant : ${longANumberOfCatsIWant::class.java} , the value is $longANumberOfCatsIWant ")


    //be carefull when convert something like bigger mnemoru used to smaller because the data will ngaco
    var thisIsALongNumber = 7900000004556546
    println(thisIsALongNumber::class.java)
    var intThisIsALongNumber = thisIsALongNumber.toInt()
    var doubleThisIsALongNumber = thisIsALongNumber.toDouble()
    var floatThisIsALongNumber = thisIsALongNumber.toFloat()
    println("Type of thisIsALongNumber is ${thisIsALongNumber::class.java} and the value is $thisIsALongNumber")
    println("Type of intThisIsALongNumber is ${intThisIsALongNumber::class.java} and the value is $intThisIsALongNumber")
    println("Type of intThisIsALongNumber is ${intThisIsALongNumber::class.java} and the value is $intThisIsALongNumber")
    println("Type of doubleThisIsALongNumber is ${doubleThisIsALongNumber::class.java} and the value is $doubleThisIsALongNumber")
    println("Type of doubleThisIsALongNumber is ${doubleThisIsALongNumber::class.java} and the value is $doubleThisIsALongNumber")
    println("Type of floatThisIsALongNumber is ${floatThisIsALongNumber::class.java} and the value is $floatThisIsALongNumber")
    println("Type of floatThisIsALongNumber is ${floatThisIsALongNumber::class.java} and the value is $floatThisIsALongNumber")


}