fun main(args: Array<String>) {
    var name = "Cahyadesthsina"
    name = "cahya"
    
    when (val lengttName = name.length) {
        in 1..5 -> println("$name has $lengttName char. it is short")
        in 6..10 -> println("$name has $lengttName char. it is medium")
        else -> println("$name has $lengttName char. it is long")
    }
}