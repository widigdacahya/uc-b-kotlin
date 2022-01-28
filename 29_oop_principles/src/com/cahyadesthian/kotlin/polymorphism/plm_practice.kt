package com.cahyadesthian.kotlin.polymorphism

fun main(args: Array<String>) {
    val theGreeting = Translatter()

    theGreeting.sayHello()

    theGreeting.sayHello("fr")
}

class Translatter {
    fun sayHello() {
        println("English: Hello!")
    }

    fun sayHello(language: String) {
        when(language) {
            "fr" -> println("Frensh: Bonjour!")
            "ch" -> println("Chinese: Ni hao!")
            else -> println("English: Hello!")
        }
    }
}