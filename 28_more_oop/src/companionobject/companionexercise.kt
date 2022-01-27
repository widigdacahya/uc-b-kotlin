package companionobject

fun main(args: Array<String>) {
    var myBook = Book(Book.getEditor())

    println("I have a book that editor is ${myBook.editor.editorName}")
}

class Book(val editor:Editor) {

    companion object {
        fun getEditor() = Editor("J.K. Rowling")
    }

}

class Editor(val editorName: String) {

}