package practice

class Animal {

    var animalKind = "an Animal"
    var topSpeed:Int? = 0

    //IF we using this form, need to specifiy or declare again when function called
    // we can refer direct on variable that it had modified from the main
//    fun run(kind:String, speed:Int) {
//    println("The $kind is running on fastes speed $speed")
//    }

    fun run() {
        println("The $animalKind is running on fastes speed $topSpeed")
    }


}

fun main(args:Array<String>) {
    var cat = Animal()
    cat.run()
    cat.animalKind = "Cat"
    cat.topSpeed = 50
    cat.run()
}