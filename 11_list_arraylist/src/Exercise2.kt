fun main(args: Array<String>) {
    var animals = arrayListOf<String>("lion", "zebra", "chimp", "elephant")
    println(animals)
    println()

    val newComer = "panda cub"
    animals.add(newComer)
    println(animals)
    println()


    val sold = "lion"
    animals.remove(sold)
    println(animals)
    println()

    val doesZooHave = listOf<String>("elephant", "girrafes")
    println(animals.containsAll(doesZooHave))

}