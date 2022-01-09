fun main(args: Array<String>) {

    println("Hey yow, need to use the car? Have a key? (yes/no) : ")
    var inputUser = readLine()?:""
    var hasKey = inputUser.toString()

    if(hasKey=="yes") {
        println("Goode, here's the car")
    } else {
        println("Sorry")
    }

}
