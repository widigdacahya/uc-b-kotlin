package com.cahyadesthian.also

fun main(args: Array<String>) {


    Book().apply {
        printBook()
    }.also {
        println()
        println("Log : Printing book $it")
        println("Email :Sending an email about book $it")
    }
}

/*
* evertime book printed, need to log and email
* */

class Book {

    fun printBook() {
        println("Printing a book")
    }

}