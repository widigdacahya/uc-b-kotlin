fun main(args: Array<String>) {


    /**
     * type of result of an operation is the same as
     * the type of the largest operand
     * in terms of  sizr in memory
     *
     *  Byte < Short < Int < Long < Float < Double
     */

    val a: Short = 6
    val b: Int = 4
    var result = a*b
    println( "the result is $result , and the type is " + result::class.java)

    val aLong :Long = 897987564563214
    val bFloat: Float =12.564F
    var resultsecond = aLong/bFloat

    println("the second result is $resultsecond, with the type is " + resultsecond::class.java)

}