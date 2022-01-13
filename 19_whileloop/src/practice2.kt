fun main(args: Array<String>) {

    /**
     * ask user to input multiple time
     * until they input larger than 100
     *
     * */

    println()
    // print("Input a number : ")
    var indxwhile =0

    println()
    do {
        print("Input a number : ")

        var numInput = readLine()?:""
        var userNumber = numInput.toInt()
        if(userNumber > 100) println("Thanks") else println("$userNumber is small, more than 100 plz")

    } while(userNumber < 100)

    /**
     * ask user input a number
     * if factorial num less than 3.000.000
     * sdk them input another number
     * */

    println()
    print("New section here")
    do {
        var inputANum = readLine()?:""
        var numInputProc = inputANum.toInt()
        var faktorial = 1
        var res = 1L
        while(faktorial<=numInputProc) {
            res *= faktorial
            faktorial++
        }
        println("Your num is $numInputProc! = $res")
    } while(res < 3000000)

}