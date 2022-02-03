package com.cahyadesthian.sealed
/*
* DEFINE TYPES
*
* */


fun main(args:Array<String>) {

    val somePlant = getPlant()
    when(somePlant) {
        is Fruit -> println("Tasyt Fruit..yummy")
        is Vegetable -> println("Veggies are best")
    }

}

/*
* Define a restricted hierarcy
*
* Abstract by default so cannot be initiated
*
* Useful in when expressions
*
* */

abstract class Plant

sealed class Fruit:Plant()
sealed class Vegetable:Plant()

class Apple:Fruit()
class Potato:Vegetable()

fun getPlant():Plant = Apple()

