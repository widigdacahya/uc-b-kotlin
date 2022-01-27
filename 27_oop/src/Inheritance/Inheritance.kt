package Inheritance

fun main(args: Array<String>) {
    val myDOg = Corgi()
    myDOg.size = 10
    println(myDOg.size)
    myDOg.play()
    myDOg.bark()
}

/**
 * INHERITANCE
 *
 * Can apply variable and methods of a class to another class
 *
 * a class inherits from another class
 *
 * */

//perlu ada open di depan
open class Dog {
    var size: Int = 0

    fun bark() {
        println("Guk GUk")
    }

    fun play() {
        println("Woof Woof Playing")
    }
}

//Corgi is adog so he can do something like dog
//not need defien anything :'
class Corgi: Dog() {

}

/**
 * Inheritance is transitive
 * its mean when weh have
 * [animal]
 *    |
 * [sapi]
 *   |
 * [alex]
 *
 * alex can have both from sapi and animal
 * */