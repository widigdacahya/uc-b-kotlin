fun main(args: Array<String>) {

    /**
     * When as stemtnt
     * */

    var animal = "dog"

    /**
     * Curly braces are not needed
     * if there is only one line of code
     * */
    val action = when(animal) {
        "cat" -> "feed it"
        "dog" -> {
            println("Wihii there is a dog")
            "per it"
        }
        else -> "google it"
    }

    println("When you meet $animal, you should $action")

    /**
     * if two values have same effect
     * they can put in one line, separated by comma
     * */
    val month = "Jul"
    val days = when(month) {
        "Jan","March", "May" -> 31
        "Feb" -> 28
        else -> 30
    }

    println("The days of $month are $days")
}