fun main(args:Array<String>) {
    var name = "Mike"
    println(name.eraseFirst())
}

/*
* Extension Functions
*
* >Can add function to classes that we don't own or
*  cannot modify
* >Can access the object using the 'this' reference
* > original class is not actually modified
*
* > new function are not actually inserted in the class
*
* Rathre, it's a shortcut to make the functions available
* using the usual object.function notation
* */

fun String.eraseFirst():String {
    return this.substring(1, length-1)
}