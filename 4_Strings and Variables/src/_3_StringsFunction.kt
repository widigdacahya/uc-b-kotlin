fun main(args: Array<String>) {
    val myPet = "Wolf"
    print( myPet.length)
    println(" is the length of $myPet")

    val myPondAnimal = "Crocodile"
    val myName = "Widigda"
    println(myName.capitalize())
    println(myName.decapitalize())

    val tooManySpaces = "   there are   so many  spacess, unfortunately trim only delete on the begining and the end"
    println(tooManySpaces.trim())

    println(myPondAnimal.get(0))
    println(myPondAnimal[0])
    //println(myPondAnimal.get(10))
    println(myPondAnimal.substring(2))
    println(myPondAnimal.substring(2,5))

    println(myPondAnimal.plus(" Blue"))
}