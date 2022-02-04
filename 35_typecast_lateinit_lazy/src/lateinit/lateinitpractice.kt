package lateinit

fun main(args: Array<String>) {

    val myBestie = Country().apply { katakanSebuahNama("Padmasari") }
    println(" Hello Bestie :v ${myBestie.getName()}")


}

class Country {
    private lateinit var sebuahName: String

    fun katakanSebuahNama(name: String) {
        this.sebuahName = name
    }

    fun getName() = sebuahName
}

/*
*
* A class country has a private variable name,
* function that initializs that variable and a function that
* return the non null country name
*
* In your main program, initialze an object
* of class Country and print out message for that
* country name
*
* */

