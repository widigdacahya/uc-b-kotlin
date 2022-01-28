package com.cahyadesthian.kotlin.inheritance.practice

fun main(args: Array<String>) {
    val dico = parakeet()
    dico.fly()
}

open class Bird {
    open val color = "gray"
    open val speed = 50

    open fun fly() {
        println("a $color bird could fly with speed $speed kmh")
    }
}

class parakeet: Bird() {

    override val color = "blue"
    override val speed = 25

    override fun fly() {
        //with parakeet data
        super.fly()

        //with parent data
        println("A ${super.color} bird can fly up to ${super.speed} kmh")
    }

}