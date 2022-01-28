package com.cahyadesthian.kotlin.inheritance

/*
* INHERITANCE
* classes can inherit method and parameter from other class
*
* > class can inheritable by using open in fron of class
* > if class has multiple constructor, at least one must be initialiazed
* */

fun main(args:Array<String>) {
    val padmasari = Daughters("Indonesia")
    padmasari.say("Dinner Time")
    println("Hi I'm Padmasari, my hair is ${padmasari.hariColor} and my eye's color is ${padmasari.eyeColor}")
}


open class Moms(nativeLang : String) {
    val hariColor = "brown"
    val eyeColor = "blue"

    fun say(message: String) {
        println("Mom says \" $message \"")
    }



}


class Daughters(nativeTongue: String): Moms(nativeTongue) {

}