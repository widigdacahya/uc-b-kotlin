package com.cahyadesthian.data

/*
* STORE DATA
* */

fun main(args: Array<String>) {

    var cahyaUser = User("Desthian", "thisIsAnEmail@gmail.com", "thisIsAPassword")

    //it would print the information like we want :D, biasanya ngeprint objek :')
    println(cahyaUser)

}

/*
* Commonly create classes just for storing data
*
* Primary constructor has at least one parameter
*
* All primary constructor parameter need tob val or var
*
* can have body but not required
*
* */


data class User(
    val name:String,
    val email :String,
    val password: String
)