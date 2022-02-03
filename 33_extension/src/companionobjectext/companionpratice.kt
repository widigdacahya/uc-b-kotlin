package companionobjectext

/*
* Add companion object function to String class that prints out
* a message saying what type of class this is
*
* Call the companion object
*
* */

fun main(args: Array<String>) {
    String.getTypeOfTheClass()
}

fun String.Companion.getTypeOfTheClass() {
    println("This class is soemthing in Kotlin :)")
}