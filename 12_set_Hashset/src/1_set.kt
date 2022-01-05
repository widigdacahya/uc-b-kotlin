fun main(args: Array<String>) {

    /*
    * Set = stores unique elements in an undefined order
    *
    * */


    val numbers = setOf(6,34,6,1357)
    println(numbers)    //6 will be printed only 1 times

    //create empty set need to specify the type
    val wannaMakeEmptySet = setOf<Int>()
    println(wannaMakeEmptySet)

    //a set can contain null, but only one
    val aSetWithNull = setOf<Int?>(null, 5, 2, 9 , null)
    println(aSetWithNull)


}