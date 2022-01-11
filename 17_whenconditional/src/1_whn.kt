fun main(args: Array<String>) {

    /**
     * When as conditional
     * */

    var animal = "cat"
    var action : String = ""

    when(animal) {
        "cat" -> {
            action = "pet it"
        }
        "dog" -> {
            action = "feed it"
        }
        else -> {
            action = "google it"
        }
    }

    println("When you meet $animal, you need to $action")


    var result = ""
    val number = 8472
    when(number%2) {
        0 -> result = "Number is even"
        1 -> result = "Number is odd"
    }

    println("Your number is $number, so $result")


}