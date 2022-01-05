fun main(args: Array<String>) {

    //these(function of the list) also could be aplied on arrayList

    val colors = listOf("blue", "red", "green", "purple", "black", "blue")
    println(colors.size)
    println(colors.contains("bworn"))
    println(colors.contains("red"))

    val someColor = listOf("red", "green")
    println(colors.containsAll(someColor))
    val someColor2 = listOf("white", "green", "purple")
    println(colors.containsAll(someColor2))

    println(colors.indexOf("black"))
    println(colors.lastIndexOf("blue"))
}