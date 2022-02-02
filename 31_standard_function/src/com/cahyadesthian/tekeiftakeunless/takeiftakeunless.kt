package com.cahyadesthian.tekeiftakeunless

import kotlin.random.Random

fun main(args: Array<String>) {

    println("First Attempt TAKE IF")
    for(i in 1..10) {
        println("chance $i")
        var aNumber = Random.nextInt(100)
        var genapOrNull = aNumber.takeIf { it%2 == 0 }
        println("Is Number $aNumber genap or oven ? $genapOrNull")
    }

    println()
    println("------------------------------------")
    println("Second Attempt TakeUnless")
    for (i in 1..10) {
        println("Chanche $i")
        var theNum = Random.nextInt(100)
        var oddGanjilorNull = theNum.takeUnless { it%2 == 0 }
        println("Is number $theNum odd/ganjil? $oddGanjilorNull")
    }



}

/*
* [ Take if ]
* Return object if the predicate values ture
* otherwise return null
*
* [ Take unless ]
* Return object if predicate valuews to false
* otherwise return  null
*
* */

