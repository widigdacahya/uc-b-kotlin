package com.cahyadesthian.kotlin.inheritance.exercise

fun main(args: Array<String>) {
    val antasena = Son()
    antasena.fullName()
}

open class Father {
    open var firstName = "Barunastra"
    open val lastName = "Anargya"

    open fun fullName() {
        println(firstName + " " + lastName)
    }


}

class Son : Father() {
    override var firstName: String = "Bramantya"
//        get() = super.firstName
//        set(value) {
//            field = "Bramantya"
//        }

    override fun fullName() {
        super.fullName()
        println("I am the son of ${super.firstName} ${super.lastName}")
    }
}