package companionobjectext

fun main(args:Array<String>) {
    Book.printBookInfo()
}

class Book {
    companion object {

    }
}

fun Book.Companion.printBookInfo() {
    println("The awesome book is still printing . . .")
}