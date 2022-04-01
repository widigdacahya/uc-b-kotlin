package polymorphism

fun main(args: Array<String>) {
    val myNissan = Nissan()
    myNissan.engineOn()
}

open class Car {
    open fun engineOn() {
        println("${javaClass.simpleName} engine is On")
    }
}

class Nissan: Car() {
    override fun engineOn() {
        super.engineOn()
        println("Now we can go with ${javaClass.simpleName}")
    }
}

/**
 * Method Overloading
 * - posisble ony in same class
 * - static methods can be overloaded
 * - a.k.a static binding or early bindig
 * - used to implement compile time polymorphism
 * - has same method name in same class with different signature
 * - help to extend functionalitites
 *
 * Method Overriding
 * - posibleo only in derived class
 * - method must be non-virtual or static method for overloading
 * - also known as dynamic binding or late binding
 * - used to implement run time polymorphism
 * - derived class hace same method name with same signature of parent class
 * - it help to overwrite or change existing functionalities
 *
 *
 * */