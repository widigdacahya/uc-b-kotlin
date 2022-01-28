package com.cahyadesthian.kotlin.polymorphism

fun main(args: Array<String>) {

    val aMother = Mother()
    val aDaughter = theDaughter()

    aMother.say("Hwello")
    aDaughter.say("Hi")
}

open class Mother {
    open fun say(msg: String) {
        println("Mom says $msg")
    }
}

class theDaughter: Mother() {


    override fun say(msg:String) {
        println("The daughter say $msg")
    }
}