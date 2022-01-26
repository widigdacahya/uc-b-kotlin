package exercise.client

import exercise.hello.greetHi
import practice.cahyadesthian.printhello.greetHi

fun getName() {
    print("Enter the Client name : ")
    var nameClient = readLine()?:""
    greetHi(nameClient)
}