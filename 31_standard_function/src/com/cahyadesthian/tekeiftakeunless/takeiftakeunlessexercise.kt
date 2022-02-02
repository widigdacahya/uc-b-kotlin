package com.cahyadesthian.tekeiftakeunless

fun main(args: Array<String>) {

    val numberUserInputGanjiltanpa3dan13 = arrayListOf<Int>()
    println("Please Introduce 10 numbers")

    for (i in 1..10) {
        val inputUser = readLine()?:""
        val theNumber = inputUser.toInt()

        theNumber.takeIf { it%2 != 0 }
            .takeUnless { it==3 || it==13 }
            ?.let { numberUserInputGanjiltanpa3dan13.add(it) }
    }

    println("Then Number that odd unless 3 or 13")
    println(numberUserInputGanjiltanpa3dan13)

}
