package practice2

fun main(args: Array<String>) {
    var mathOwn = Math()

    println("The Sum 7 and 8 is ${mathOwn.add(7,8)}")
    println("The Subtraction 8 and 9 is ${mathOwn.sub(8,9)}")
    println("The multiplication of 5 and 4 is ${mathOwn.mul(5,4)}")
    println("The division 7/4 is ${mathOwn.div(7,4)}")

}

class Math {

    fun add(a:Int, b:Int) = a+b
    fun sub(a:Int, b:Int) = a-b
    fun mul(a:Int, b:Int) = a*b
    fun div(a:Int, b:Int) = a/b

}