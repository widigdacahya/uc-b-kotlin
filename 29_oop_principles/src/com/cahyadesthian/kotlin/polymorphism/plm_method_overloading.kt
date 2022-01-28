package com.cahyadesthian.kotlin.polymorphism

fun main(args: Array<String>) {

    val aMother = Mother2()
    val aDaughter = theDaughter2()

    aMother.say("Hwello")
    aMother.say()
    aMother.say(4)
    aMother.say("good night",4)

    aDaughter.say("Hi")
}

open class Mother2 {
    open fun say(msg: String) {
        println("Mom says $msg")
    }

    //method overloading = some kind of the fun tht has same name
    fun say() {
        println("Mom say nice to see you")
    }

    fun say(times:Int) {
        for(i in 0..times) {
            println("Hello from Mom")
        }
    }

    fun say(ms:String, times:Int) {
        for(i in 0..times) {
            println("Mom has msg : $ms")
        }
    }

}

class theDaughter2: Mother2() {


    override fun say(msg:String) {
        println("The daughter say $msg")
    }
}