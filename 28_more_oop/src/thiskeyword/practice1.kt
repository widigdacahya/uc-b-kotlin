package thiskeyword

fun main(args: Array<String>) {
    var chayGotABox = Box()
    println("Content of the box is ${chayGotABox.contents}")
    chayGotABox.updateBoxContent("Mac M1 from Dicoding")
    println("Content of the box is ${chayGotABox.contents}")
}

class Box {
    var contents :String = ""

    fun updateBoxContent(contents:String) {
        this.contents = contents
    }

}