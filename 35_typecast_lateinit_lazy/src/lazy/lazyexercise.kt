package lazy

fun main(args: Array<String>) {

    val usernameUser by lazy { UserApplication() }
    val bannedUsername = listOf("Bad people", "", "AgilYgItu", "AnjasYgItu", "FaridYgItu", "Bob", "Carrol")
    println("Enter a username: ")
    val userInputUsername = readLine()?:""
    if(!bannedUsername.contains(userInputUsername)) {
        usernameUser.printMsgWlcm(userInputUsername)
    }

}


//object of class NewUser is create for each new user
/*
* It contain a function to print welcome message
*
* Ask the user to input their desired username
*
* If it is not part of the list, create the Newuser
* object and print welcome
*
* */

class UserApplication {
    //var usernameUser: String? = ""

    fun printMsgWlcm(nameUsernameInp:String) {
        println("Hi, welcome $nameUsernameInp | have a nice day")
    }

}