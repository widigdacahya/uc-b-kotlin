package init

fun main(args:Array<String>) {
    val newLappy = Lappy("Lenovo Ideapad5")
}

class Lappy(val operatingSystem : String) {
    init {
        println("Operating system $operatingSystem is running")
    }
}

