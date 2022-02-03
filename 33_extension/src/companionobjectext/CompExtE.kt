package companionobjectext

fun main(args:Array<String>) {
    println(43.5.returnTypeName())
    Double.prtinClasstype()
}

fun Double.returnTypeName() = "This is Double type :D "

fun Double.Companion.prtinClasstype() {
    println("This is Double class")
}
