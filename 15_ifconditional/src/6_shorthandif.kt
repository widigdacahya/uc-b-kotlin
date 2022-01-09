fun main(args:Array<String>) {

    /**
     * 1. curly bracket can be ommited if only 1 statement
     * */

    var isEven : String? = null
    val number = 25

    if(number%2==0)
        isEven = "Number is Even"
    else
        isEven = "Number is Odd"

    println("So number is $isEven")

    /**
     * 2. If statment can return a value
     * */
    println()
    var aNumber2 = 24
    var isEven2 = if(aNumber2 %2 ==0)"Number is Even" else "number is Odd"
    println("So the $aNumber2 is $isEven2")


}