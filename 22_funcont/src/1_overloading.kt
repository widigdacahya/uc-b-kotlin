fun main(args: Array<String>) {

    /**
     * Overloading
     *
     * Same function can have the same name
     *  >if they have different number or type of parameter
     * */

    println("First is ${multiply(3)}")
    println("Second is ${multiply(5,4)}")

    greetPip("Cahyadesthian")
    greetPip( listOf("Padmasari", "Andhini", "Anindyasawari", "Ambarsari", "Asmaralaya", "Aswangga"))

}


fun multiply(number: Int) = number * 2

fun multiply(number:Int, multiplier: Int) = number * multiplier

fun greetPip(peopleName : String) {
    println("Hello, have a great day $peopleName")
}

fun greetPip(peopleName: Collection<String>) {
    for (person in peopleName) {
        println("Hwello, lovely day right, $person")
    }
}