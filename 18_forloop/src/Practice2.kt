fun main(args: Array<String>) {

    /**
     * 1
     * ask user to input a number
     * call it maxValue
     *
     * print out every number smaller than maxValue that
     * divisble by 7, in descending order
     * */
    println()
    print("Input a number plz :  ")
    var numUser = readLine()?:""
    var maxValue= numUser.toInt()

    for(i in maxValue downTo 0) {
        if(i%7==0) {
            println("The value $i")
        }
    }

    /**
     * 2
     * print smiley face
     * with form of segitiga siku-siku
     * */

    println()
    println("Replicate the outcome of smileyface in segitiga siku-siku")
    for (i in 1..10) {
        for(j in 1..10) {
            if(j<= i) {
                print("\uD83D\uDE02")
            }
        }
        println()
    }

}