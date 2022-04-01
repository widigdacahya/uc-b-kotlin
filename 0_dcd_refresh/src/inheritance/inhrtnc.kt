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


//for [ multiple Inheritance ]
interface Ovipar {
    var egg:Int
    fun layEgg()
}

interface Vivipar {
    var bornSkill: String
    fun giveMilkToCHild()
}

interface Ovovivipar: Ovipar,Vivipar

class Snake(override var egg: Int, override var bornSkill: String) : Ovovivipar {
    override fun layEgg() {
        println("I am laying egg and left the egg, kind a $egg eggs")
    }

    override fun giveMilkToCHild() {
        println("Not doing this I think")
    }

}


class WhatANimal : Ovovivipar {
    override var bornSkill: String = "Average"
    override var egg: Int = 20

    override fun layEgg() {
        println("Lay egg about $egg in the garden of human")
    }

    override fun giveMilkToCHild() {
        println("WHole day until the kid strong enough to fin eat by themself")
    }
}
// multiple inheritance



fun main(args: Array<String>) {

    //Single level inheritence
    var catPeppa = Cat()
    catPeppa.walk()

    println()
    //Multileve inheritance
    val jsh = JSHCat()
    jsh.eat()
    jsh.walk()


    println()
    println()
    //multiple INheritance
    val mySnake = Snake(10, "none")
    println("Bornskill : ${mySnake.bornSkill}")
    println("Egg : ${mySnake.egg}")
    mySnake.layEgg()
    mySnake.giveMilkToCHild()

    println()
    val someAnimalWeDontknow = WhatANimal()
    someAnimalWeDontknow.egg = 100
    println("HOw manny egg : ${someAnimalWeDontknow.egg}")
    someAnimalWeDontknow.layEgg()




}