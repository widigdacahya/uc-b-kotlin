package com.cahyadesthian.let

fun main(args: Array<String>) {

    awesomAns()

}

fun awesomAns() {
    var clientNames = arrayListOf<String?>()
    println("Yow, need client list name below :) ")

    var inputUserTemp: String? =""
    var clientCounter = 1


    do {

        print("Client $clientCounter : ")
        inputUserTemp = readLine()
        inputUserTemp?.let {
            if (it.lowercase() != "stop") {

                if(it == "") {
                    clientNames.add(null)
                } else {
                    clientNames.add(it)
                }

            }

        }

        clientCounter++
    } while (inputUserTemp!= "stop")

    println()
    println("List of Client Names : ")
    println(clientNames)

    println()
    clientNames.forEach {
        it?.let {
            println("Have a nice day $it")
        }
    }

}

fun selfAnswer() {
    // Read client names, when word stops appeared , stop read
    // greet everyone

    var clientName = arrayListOf<String?>()

    var inputUser : String? = ""

    println("Hi, input Clientname below")
    var numClient = 1

    do {

        println("Client $numClient : ")
        inputUser = readLine()
        inputUser?.let {

            if(it.lowercase() != "stop") {

                if(it=="") {
                    clientName.add(null)
                } else {
                    clientName.add(it)
                }
            }
        }
        numClient++

    } while (inputUser != "stop")


    clientName.forEach {
        println("Hello, Have a  nice day $it")
    }
}