fun main(args: Array<String>) {

    /**
     * Ask a user to input their age.
     * If  under 13, they are a child
     * under 18, they are a teen
     * older, they are an adult.,
     * Use range,If the age is 0, convert it to 1.
     * */

    print("Sorry, please enter your age:  ")
    val inputUser = readLine()?:""
    var userInp = inputUser.toInt()

    val message = if(userInp == 0 ) {
        userInp = 1
        "You are $userInp, so you are child"
    } else if(userInp in 1..12) {
        "You are $userInp, so you are child"
    } else if(userInp in 13..17) {
        "You are $userInp, so you are teen"
    } else {
        "Youre an adult"
    }

    println("Hello,, good mowing, $message")


}