package com.cahyadesthian.also

fun main(args: Array<String>) {
    Chevy().apply {
        buildChevy()
    }.also {
        println()
        println("Log : new Chevy build by id $it")
        println("Police : pssst new one come. It $it")
    }
}

class Chevy {

    fun buildChevy() {
        println("New Chevy is consturcted")
    }

}