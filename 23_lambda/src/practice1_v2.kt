fun main(args: Array<String>) {

    var myListNumber : ArrayList<Int> = arrayListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)
    println("My firs List Number = $myListNumber")

    var secondList = tenDivider(myListNumber) {anInt: Int -> anInt/10}
    println("List number after func. applied is $myListNumber")
    println("List number after func. applied is $secondList")

}

fun tenDivider(numbers: ArrayList<Int>, lambdaFunction: (Int)-> Int ) : ArrayList<Int> {
    for(i in 0 .. numbers.size-1) {
        if(numbers[i]%2 == 0) {
            numbers[i] = lambdaFunction(numbers[i])
        }
    }
    return numbers
}