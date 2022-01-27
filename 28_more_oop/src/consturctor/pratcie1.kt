package consturctor

fun main(args: Array<String>) {

    var table1 = Table()
    println()

    var table2 = Table(5)
    println()

    var table3 = Table(8,250)

}

class Table {

    var legs = 4
    var height = 100

    fun printInfo() {
        println("The Table has $legs legs and the height is $height")
    }

    constructor() {
        legs = 3
        height = 110
        printInfo()
    }

    constructor(legInfo: Int) {
        legs = legInfo
        height = 120
        printInfo()
    }

    constructor(legInfo: Int, heightInfo: Int) {
        legs = legInfo
        height = heightInfo
        printInfo()
    }
}