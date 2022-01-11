fun main(args: Array<String>) {
    /**
     * 1.
     * a club has a guestlist
     * a guest comes and gives their name
     * (inputs to the console)
     *
     * will the user have access to the club?
     * */

    val clubListName = listOf("cahya","desthian", "rizki", "widigda")

    println("--- Number 1 ---")
    println("Hi welcome, nice to see you, but to enter the room, we need to know your name : ")
    var inputUser = readLine()?:""
    var procesString = inputUser.lowercase()

    if(procesString in clubListName) {
        println("Welcome, here the key")
    } else {
        println("we are so sorry, your name was not in the list")
    }

    /**
     * 2.
     * Ask a user about how many cat they have
     * then print the appropriate text
     * 1 to 3    -> few cats
     * 4 to 6    -> several cats
     * 7 or more -> many cats
     * the print "a lady has ... cats"
     * */
    println()
    println("--- Number 2 ---")
    print("How many cat do you have? ")
    val userCat = readLine()?:""
    val aNumberCat = userCat.toInt()
    val catNum = if(aNumberCat in 1..3) {
        "few cats"
    } else if(aNumberCat in 4 ..6) {
        "several cats"
    } else if(aNumberCat ==0) {
        "no cats"
    } else {
        "many cats"
    }

    println("A lady has $catNum")


    /**
     * 3.
     * an animal shelter has a list of animals that it tries to get adopted
     * they tryi to print e message
     * ether advise available anima if there are any animal in shelter
     * or thank to the community id all animal have benn adopted
     *
     * */

    println()
    println("--- Number 3 ---")
    val animals = arrayListOf<String>()

    if(animals.isEmpty()) {
        println("THank for adopting :)")
    } else {
        println("Please come and adopt some")
        println("We have $animals")
    }

}