package inheritance


open class Animal {
    open fun walk() {
        println("${javaClass.simpleName} walk!")
    }
}

class Cat: Animal() {
    override fun walk() {
        //super.walk()
        println("Meowng! ${javaClass.simpleName} walked")
    }
}

class inhrtnc {

}

open class Carnivore : Animal() {
    fun eat () {
        println("Nyam nyam, I car eat a meat. ${javaClass.simpleName} loves eat")
    }
}

class JSHCat : Carnivore() {
    override fun walk() {
        println("JSH walking")
    }

}

fun main(args: Array<String>) {

    //Single level inheritence
    var catPeppa = Cat()
    catPeppa.walk()

    println()
    //Multileve inheritance
    val jsh = JSHCat()
    jsh.eat()
    jsh.walk()

}