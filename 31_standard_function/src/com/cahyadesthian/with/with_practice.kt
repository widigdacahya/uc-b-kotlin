package com.cahyadesthian.with

fun main(args: Array<String>) {

    with(Person()) {
        firstName = "Padmasari"
        lastName = "Agniasari"
        //infoPerson()
        age = 21
        infoPerson()
    }


    var person1 = Person()
    with(person1) {
        firstName = "Cahyadesthian"
        lastName = "Widigda"
        age = 9
        infoPerson()
    }


    println()
    println("Some changes")

    person1.firstName = "Desthian"
    person1.infoPerson()
}

class Person {
    var firstName = ""
    var lastName = ""
    var age = 0

    fun infoPerson() {
        println( "A people name is $firstName $lastName and $age y.o." )
    }
}