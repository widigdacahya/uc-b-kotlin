package lazy

import kotlin.random.Random

fun main(args: Array<String>) {

    val thisIsLargeVariableThatMakeExpensiveComputation: String by lazy {
        "Some large variable so big big big BIG"
    }

    if(Random.nextInt()%2 == 0)
        println(thisIsLargeVariableThatMakeExpensiveComputation)

}

/*
*
* Lazy var are initialzed when needed
*
* Useful to save memory in case the variable is never accessed
*
*
* */