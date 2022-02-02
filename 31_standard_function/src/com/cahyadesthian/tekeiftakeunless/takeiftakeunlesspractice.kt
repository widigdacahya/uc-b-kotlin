package com.cahyadesthian.tekeiftakeunless

fun main(args: Array<String>) {
    val nummbers = listOf(3,54,23,115,46,35,124,24,426,876,32,124,346,475,412,436,14,346,135)

    println("Hey I have a list of number $nummbers")

    println()
    println("If the number applied a take if even become")
    val evenNumber = arrayListOf<Int>()
    nummbers.forEach {
        if(it%2 == 0) {
            evenNumber.add(it)
        }
    }
    println(evenNumber)

    println()
    println("Other way")
    val genap = arrayListOf<Int>()

    for(number in nummbers) {
        number.takeIf { it%2 == 0 }
            ?.let { genap.add(it) }
    }
    println(genap)

}

