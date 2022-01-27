package thiskeyword

fun main(args:Array<String>) {
    val postIt = PostItNote()
    postIt.printMessage()
    postIt.updateMessage("Hwello, beautiful day right?")
    postIt.printMessage()
}

class PostItNote() {
    var message:String = "No Message"

    fun updateMessage(message: String) {
        this.message = message

    }

    fun printMessage() {
        println("THe message is $message or same with ${this.message}")
    }



}