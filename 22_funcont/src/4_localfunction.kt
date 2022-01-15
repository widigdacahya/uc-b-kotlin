fun main(args: Array<String>) {
    listAnimals()
}

fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("I have a $animal")
    }

    var animals = listOf("Cats", "Dogs", "Rabbits", "Sheeps")
    for(animal in animals) {
        listOneAnimal(animal)
    }
}