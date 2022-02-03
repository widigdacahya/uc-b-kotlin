fun main(args:Array<String>) {
    var name = "Cahyadesthian"
    println(name.betterLength)
    println(name.theBetterLength)
}

/*
* Can add proprties to classes, in a similiar way to function
*
* */

//They cannot be local
//i.e. declared inside a function or classs
val String.betterLength:Int
    get() {
        println("Getting the better length")
        return 200
    }

val String.theBetterLength:Int
get() = 300

/*
* Cannot update an extension property
*   can only use values(val). not variables(var)
* */

/*
* Not actually inserted to calss
*
* the extension properties are a shortcut for the . notation
*
* */

