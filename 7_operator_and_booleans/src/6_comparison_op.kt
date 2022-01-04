fun main(args: Array<String>) {
    var a= 5
    var  b = 6

    println("if we have a = $a and b = $b so :")
    println("$a > $b will return ${a>b}")
    println("$a < $b will return ${a<b}")
    println("$a >= $b will return ${a>=b}")
    println("$a <= $b will return ${a<=b}")
    println("$a == $b will return ${a==b}")
    println("$a != $b will return ${a!=b}")

    println("We can alson assign the result of comparion into varibale, these variable would become boolean variable")
    var aResult = a!=b
    println("If we have var aResult = a!=b so the aResult now is $aResult")


}