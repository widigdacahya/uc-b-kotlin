fun main(args: Array<String>) {
    /**
     *  there is set of username
     *   ask the user to choose their username.
     *   if theri username is taken print
     *   out message and ask again
     *
     *   add username to the set
     *
     * */

    println()
    val username = hashSetOf("john", "bob", "alice")
    var finished = false

    do {
        print("Input a username : ")
        var usernameInp = readLine()?:""
        if(username.contains(usernameInp)) {
            println("Username $usernameInp already input, input another user")
        } else {
            username.add(usernameInp)
            println("Oke now your usenrame is $usernameInp")
            finished = true
        }
    } while(!finished)




    println("So, oour database of username is $username")

}