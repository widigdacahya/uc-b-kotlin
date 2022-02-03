fun main(args:Array<String>) {
    println("Some String".getCustomName() + "Some String")

    println(8.getCustomName() + " 8")
    println(5.1F.getCustomName() + " 5.1F")

}

fun String.getCustomName() = "A String of characters"

fun Int.getCustomName() = "An Integer Number"

fun Float.getCustomName() = "A floating point number"