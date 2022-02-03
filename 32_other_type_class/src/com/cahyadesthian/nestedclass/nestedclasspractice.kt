package com.cahyadesthian.nestedclass

fun main(args: Array<String>) {

    var myComputer = Computer()
    myComputer.bootUp()

}

/*
* A computer must have an operating sydtem in order to run properly
*
* */

class Computer {


    fun bootUp() {
        println("Booting up computer")
        val os = OperatingSystem()
        os.startOS()
        println("Computer Ready")
    }


    inner class OperatingSystem {

        fun startOS() {
            println("OS started")
        }
    }

}