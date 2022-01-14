fun main(args: Array<String>) {


    for(i in 1..3) {
        askSomethin()
    }


}

fun askSomethin() {
    println("Yow, we need to ask you several things :D")
    print("What is your name : ")
    var inpName = readLine()?:""

    //println()
    print("What year that you see this amazing world : ")
    var inpAge = readLine()?:""
    var ageNum = inpAge.toInt()

    //println()
    println("\nOkey well, good morwning $inpName , this year is gonna be your ${2022 - ageNum} old in this earth")
}