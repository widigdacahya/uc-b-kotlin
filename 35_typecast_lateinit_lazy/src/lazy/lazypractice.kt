package lazy

import kotlin.random.Random

/*
* Need function that creates an
* array with array list with 1000
* random integers
* and assign the result to a variable
*
* Ask the user to input to the console whether
* the list should be generated. If they enter
* 'yes', generate and print the list, othrwis
* dont
*
* */

fun main(args: Array<String>) {

    val listItgUserOpt by lazy { generateList() }
    println("We could generete 1000 integer :o")
    print("Want to see it?(yes/no) : ")
    var userInp = readLine()?:""

    if(userInp == "yes")
        println(listItgUserOpt)

}

fun generateList(): List<Int> {

    val listItg = arrayListOf<Int>()

    for(i in 1..1000) {
        listItg.add(Random.nextInt(10000))
    }
    return listItg

}