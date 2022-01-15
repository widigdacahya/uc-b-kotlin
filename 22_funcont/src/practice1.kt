fun main(args: Array<String>) {
    feedAnimal("Cat")
    feedAnimal(listOf("Dogs","Rabbit","Cats"))
    feedAnimal(setOf("Shark","Crocodile", "Whale"))

    var userInp = readLine()?:""
    printSize(userInp)

    var userInpInt = readLine()?:""
    var userInt = userInpInt.toInt()
    printSize(userInt)
}

/**
 * create overloaded function that takse either animal or a list of animals
 *
 * then prints out the message to feed each animal
 *
 * */

fun feedAnimal(animalKind: String) {
    println("Hi... this is a feed, you gonna love it $animalKind")
}

fun feedAnimal(animalKind: Collection<String>) {

    for(animal in animalKind) {
        //println("Utuututu...here feed $animal")
        feedAnimal(animal)
    }

}


/**
 * Create function thath thakse mesage and print
 * the size of that message
 *
 * overload afunction to take integer, print string that has
 * the size of these integer. COntent of sting not important
 *
 * */
fun printSize(aMessage : String) {
    println("The length of message '$aMessage' is ${aMessage.length}")
}

fun printSize(lengtMsg: Int) {
    var buffer = ""
    for(i in 1..lengtMsg) {
        buffer += 'a'
    }
    println("The message that has length $lengtMsg is $buffer")

}