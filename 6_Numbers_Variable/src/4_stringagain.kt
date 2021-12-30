fun main(args: Array<String>) {
    val aNumber = 3
    val convertedNumber = aNumber.toString()

    println(aNumber+8) //become 11 from 3+8
    println(convertedNumber+8) //become 38 from strin 3 concanated with 8
    println(convertedNumber::class.java)
}