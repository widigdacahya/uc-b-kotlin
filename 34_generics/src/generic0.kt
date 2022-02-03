fun main(args:Array<String>) {
    val myLappy = Box<String>()
    myLappy.display("Awesome Machine")

    println()
    val bikeBox = Box<Bike>()
    bikeBox.display(Bike())

    println()
    val usualBox = BoxModelB<String>()
    usualBox.displayInside("Somethin")

    println()
    val newBox = NewBox<Int,Float>()
    newBox.display(44,531.3F)
}

/*
* [GENERICS]
*
* example in arraylist, generic is like the type
*
*
* > a class can have type parameter
* > the type can be used variable and method
* > Useful when a class can hacle multiple type of param
*
* */

class Box<GenericHolde> {
    fun display(item:GenericHolde) {
        println(item)
    }
}

class BoxModelB<T> {
    fun displayInside(anItem: T) {
        println(anItem)
    }
}

class Bike {

}

/*
* We can have multiple generic,
* separated by commas
*
* */

class NewBox<T,U> {
    fun display(items: T, items2: U) {
        println("Item 1 : $items")
        println("Item 2 : $items2")
    }
}