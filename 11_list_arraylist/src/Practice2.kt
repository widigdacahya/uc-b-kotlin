fun main(args: Array<String>) {
    //1. priint michael positon
    val winners = listOf("Usain", "john", "Michael", "Alex", "Bob", "James")
    println("Michael finished on position ${winners.indexOf("Michael") + 1}")

    //2. printer need color red, green, blue to print
    // printer on your desj has color red,b lue
    // write a program that prints out a boolean value, on wheteher or no printer can print
    val availableColors = listOf("red", "blue")
    val reqColor = listOf("red", "green", "blue")

    println("Can print: ${availableColors.containsAll(reqColor)}")


    /*
    * 3 a recipe call the follwoing ingredients
    *   > chicken
    *   > egg
    *   > mozzarella
    *   > pepper
    *
    * we decide to replace mozarella with blue cheese
    * print out the list of ingredients
    * */

    var recipeIng = arrayListOf("chicken", "egg", "mozzarella", "pepper")
    println(recipeIng)
    //recipeIng.set(recipeIng.indexOf("mozzarella"),"Blue cheese")
    recipeIng[recipeIng.indexOf("mozzarella")] = "Blue cheese"
    println(recipeIng)

}