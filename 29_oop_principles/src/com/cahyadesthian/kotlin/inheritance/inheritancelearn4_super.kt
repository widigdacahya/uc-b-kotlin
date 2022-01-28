package com.cahyadesthian.kotlin.inheritance

/*
* INHERITANCE
* classes can inherit method and parameter from other class
*
* > class can inheritable by using open in fron of class
* > if class has multiple constructor, at least one must be initialiazed
* > "Daughter" class can override method in "mother" classes
*   using override keyword iff they marked as open
* > "Daughter" class can access "mother" class method and variable
*   using the super keyword
*
* */

fun main(args:Array<String>) {
    val padmasari = Daughter4("Indonesia")
    padmasari.say("Good Night")

    val prameswari = Mom4("Javanese")
    println("----")
    prameswari.describe()

    println()
    padmasari.momDesc() //Mom hair jadi black
}


open class Mom4(nativeLang : String) {
    open val hairColor = "brown"
    open var eyeColor = "blue"

    open fun say(message: String) {
        println("Mom says \" $message \"")
    }


    fun describe() {
        println("(Mom Class Here)Mom | $hairColor | $eyeColor ")
    }

}


class Daughter4(nativeTongue: String): Mom4(nativeTongue) {

    override val hairColor = "black"
    var daughterEyeColor= "green"

    override fun say(message: String) {
        println("Daughter says \" $message \" ")
        super.say(message)

        println("I am daughter | $hairColor | $daughterEyeColor")

        super.describe()
    }

    fun momDesc() {
        super.describe()
    }

}