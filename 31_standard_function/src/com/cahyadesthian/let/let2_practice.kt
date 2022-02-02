package com.cahyadesthian.let

fun main(args: Array<String>) {

    //number1()
    secondQuest()

}

fun number1() {

    //read text, if not null cover to int, double it and to console
    print("Please input anumber : ")
    val numberInput = readLine()
    numberInput?.let {
        try {
            val number = it.toInt()
            println("The input number if it twice is ${number*2}")
        } catch (e:Exception) {
            e.printStackTrace()
            println("Whooops")
        }
    }

}

fun secondQuest() {
    //read 3 animal from console, it could get null number
//    each print feed animal

    var aListOfAnimal = arrayListOf<String?>()
    print("Need to input 3 animals :) \n")
    for (i in 1..3) {
        print("Animal $i : ")
        var tempAnimal = readLine()
        tempAnimal?.let {
            if(it=="") aListOfAnimal.add(null) else aListOfAnimal.add(it)
        }

    }

    aListOfAnimal.forEach{

        //this gonna print null value too
        println("Feeding the awesome $it")
    }

    print("\n")
    println("No Null formation")
    aListOfAnimal.forEach{
        //this form not print null

        it?.let {
            println("Whoopsiie feeding the $it")
        }
    }

}
