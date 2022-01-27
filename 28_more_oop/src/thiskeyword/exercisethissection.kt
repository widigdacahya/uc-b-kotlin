package thiskeyword

fun main(args: Array<String>) {
    var myTable = Table()
    println("My table at first has dimension width: ${myTable.width} and height: ${myTable.height}")
    myTable.adjHeightWidth(4,5)
    println("Then ...")
    print("After updatin my table become widht ${myTable.width} and height ${myTable.height}")
}

class Table {
    var height:Int? = null
    var width:Int? = null

    fun adjHeightWidth (height:Int, width:Int) {
        this.height = height
        this.width = width
    }

}