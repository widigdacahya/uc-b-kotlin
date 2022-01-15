fun main(args: Array<String>) {
    println("First is ${magicAdder(2,3,4,5,6,7)}")
    println("Second is ${magicAdder(1,2,3)}")
}


/***
 * function takes var number of integerss
 *
 * return sum of thath integers, call it several times
 *
 * */

fun magicAdder(vararg numbers: Int): Int {
    var theRes = 0
    for(num in numbers ) {
        theRes += num
    }
    return theRes
}