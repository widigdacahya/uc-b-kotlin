package com.cahyadesthian.let

/*
* [ LET ]
* allosw us to run code on an object
* */

fun main(args: Array<String>) {

    val animals = listOf("Cat", "Dog", "Bunny", "Bear", "Zebra", "Cow", "Tiger", "Wolf")
    animals.map { it.length }
    //println(animals)

    //println()
    //println(animals.map { it.length})
        .filter { it>3 }
        .let {
            println(it)
            println("The size of list is ${it.size}")
        }


    //we can alson give name to our object

    val friends = listOf("Padmasari", "Prameswari", "Ratimaya", "Agniasari", "Ambarsari", "Arisanti", "Basagita", "Cendrawati", "Dyah", "Estiningtyas", "Hapsari")
    friends.map { it.length }
        .filter { it>5 }
        .let { filteredFriendNameList ->
            println(filteredFriendNameList)
            println("People that have name char more than 5 on the list are ${filteredFriendNameList.size}")
        }


    //if the block of code contain a singgel function call
    //we can use the method reference ::

    println()
    val thingsArround = listOf("wallet", "tasbih", "tip-x", "pen", "book", "chair", "table", "lamp", "key")
    //println(thingsArround.map { it.length>4 }) //it print out true and false form
    thingsArround.map { it.length }
        .filter { it>4 }
        .let(::println)


    //common use case to use let to filter for non-null values
    println()
    val name = readLine()
    name?.let {
        println("Yout name is $name")
    }

    println()
    val herName = readLine()
    herName?.let {
        println("Her name is $herName")
    }

}


