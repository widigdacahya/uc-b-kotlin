/**
 * Means to program that
 * there are more than argument passed
 *
 * */

fun main(args: Array<String>) {
    sayHello("Ardiningnrum", "Aristawidya","Aswangga", "Asmarini")
}

fun sayHello(vararg names: String) {
    for(name in names) {
        println("Hello $name")
    }
}