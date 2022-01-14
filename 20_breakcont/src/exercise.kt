fun main(args: Array<String>) {

    /**
     * A group of young people going to nightclub
     *
     * design program to accpet user age
     *
     * program display welcome message to each
     *
     * if age lower than 18, not allowed
     *
     * */

    println()
    println("Welcome to the nightclub ")

    while(true) {
        println("There is age restriction here, need to know yours : ")
        var readAGe = readLine()?:""

        if(readAGe == "stop") {
            break
        }

        var ageNum = readAGe.toInt()
        if(ageNum < 18) {
            println("Sorry not allowed")

        } else {
            println("Oke you can enter the house")
        }

    }



}