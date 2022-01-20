fun main(args: Array<String>) {

    aHighOrderFunc(arrayListOf(1,2,3,4,5,6)) {num: Int -> println("$num div by 10 is ${num/10}")}


    //answerKey
    val numbers = arrayListOf(1,5,6,7,12,435,56,44,34,768,45)
    println("Old Num is $numbers")
    val newNum = answerKey(numbers) {number->number/10}
    println("New num after func $newNum")
}

/**
 * Creaete HOD that takes a mutable collection
 * of integers and a lambda function. It then applies
 * the lambda function to ever even
 * element of that collection
 *
 * create lambda function that when
 * applies to an integer, it returns that
 * integer divided by 10
 *
 * Call HOF using your lambda and display the result
 * */
fun aHighOrderFunc(aNumberList: ArrayList<Int>, lambdaFun: (Int) -> Unit) {
    for (num in aNumberList) {
        if(num%2 == 0) {
            lambdaFun(num)
        }
    }
}

fun answerKey(aNumberList: ArrayList<Int>, lambdaFun: (Int) -> Int) : ArrayList<Int> {
    for(i in 0..aNumberList.size-1) {
        if(aNumberList[i]%2 == 0) {
            aNumberList[i] = lambdaFun(aNumberList[i])
        }
    }
    return aNumberList
}
