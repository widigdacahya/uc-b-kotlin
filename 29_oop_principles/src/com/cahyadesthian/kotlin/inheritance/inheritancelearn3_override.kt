package com.cahyadesthian.kotlin.inheritance

/*
* INHERITANCE
* classes can inherit method and parameter from other class
*
* > class can inheritable by using open in fron of class
* > if class has multiple constructor, at least one must be initialiazed
* > "Daughter" class can override method in "mother" classes
*   using override keyword iff they marked as open
*
* */

fun main(args:Array<String>) {
    val padmasari = Daughters3("Indonesia")
    padmasari.say("Yow, whatusppp....Have a great day!")
    println("Hi I'm Padmasari, my hair is ${padmasari.hairColor} and my eye's color is ${padmasari.eyeColor}")
}


open class Mom3(nativeLang : String) {
    open val hairColor = "brown"
    open val eyeColor = "blue"

    open fun say(message: String) {
        println("Mom says \" $message \"")
    }



}


class Daughters3(nativeTongue: String): Mom3(nativeTongue) {
    override val hairColor = "black"
    override val eyeColor = "green"

    override fun say(mes: String) {
        println("$mes I Have $hairColor hair and $eyeColor eye")
    }


}