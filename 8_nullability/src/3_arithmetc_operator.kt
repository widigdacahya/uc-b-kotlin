fun main(args: Array<String>) {

    /*
    * when interact with nullabel variable, we need
    * special operator too like the safe calls
    *   Operation       Non-null operator      Replacement Method
    * ----------------|---------------------|----------------------|
    * Addition              +                   ?.plus()
    * Subtraction           -                   ?.minus()
    * Multiplication        *                   ?.times()
    * Division              /                   ?.div()
    * Remainder             %                   ?.rem()
    * */

    val a: Int? = 8
    println(a?.plus(4))
    println(a?.minus(7))
    println(a?.times(4))
    println(a?.div(2))
    println(a?.rem(6))

    println()
    val b: Double? = 5.9
    println(b?.plus(4))
    println(b?.minus(7))
    println(b?.times(4))
    println(b?.div(2))
    println(b?.rem(6))




}