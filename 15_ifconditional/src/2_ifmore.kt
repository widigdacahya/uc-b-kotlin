fun main(args: Array<String>) {

    val petStore = listOf("cat", "fish", "parrot", "bird", "eagle", "dog", "rabbit")
    val hasCatFood = true

    if(petStore.contains("cat")) {
        if (hasCatFood) {
            println("Excuse me, iwant to adopt a cat and bough it a food :D")
        } else {
            println("Yuuw, need to adopt a cat please")
        }
    } else {
        println("CCan i ask a cat tomorrow :D ")
    }

}