package com.cahyadesthian.kotlin.inheritance

/*
* INHERITANCE
* classes can inherit method and parameter from other class
*
* > class can inheritable by using open in fron of class
*
* */

fun main(args:Array<String>) {
    val padmasari = Daughter()
    padmasari.say("Dinner Time")
    println("Hi I'm Padmasari, my hair is ${padmasari.hariColor} and my eye's color is ${padmasari.eyeColor}")
}


open class Mom {
    val hariColor = "brown"
    val eyeColor = "blue"

    fun say(message: String) {
        println("Mom says \" $message \"")
    }



}


class Daughter: Mom() {

}