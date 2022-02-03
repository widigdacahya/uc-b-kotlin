package com.cahyadesthian.sealed

fun main(args:Array<String>) {

    val theOption = getVehicle()
    when(theOption) {
        is Car -> println("You WOuld go faste")
        is Bicycle -> println("You would get healtier")
    }

}

/*
* A function get vehicle return a type Vehicle tgat can be a car or a bicycle
*
* If a bicycle is returned, printout message saying it's more healthy
*
* If car returned, printout message saying it faster
*
* */

abstract class Vehicle

sealed class Bicycle: Vehicle()
sealed class Car: Vehicle()

class Chevy:Car()
class Polygon:Bicycle()

fun getVehicle():Vehicle {
    println("Pick 1 for car | 2 for bike")
    print("Your Option : ")
    var optionUser = readLine()?:""
    var userIntProc = optionUser.toInt()
    when(userIntProc) {
        1-> return Chevy()
        else -> return Polygon()
    }


}