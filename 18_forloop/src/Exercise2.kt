fun main(args: Array<String>) {
    /**
     * Ask user anumber
     *
     * printout the suqre matrix that size is
     * same liku user input
     * inside each cell, print ou 1 emoji
     *
     * 😄 if row*column is divisible by 3
     * 🙂 if row*column % 3 is 1
     * 😱 if row*column % 3 is 2
     *
     * */

    println("Hwello")
    print("Type a number plz : ")
    var userInp = readLine()?:""
    var numberUser = userInp.toInt()

    for(i in 1..numberUser) {
        for(j in 1 .. numberUser) {
            if( i*j%3 == 0) {
                print("\uD83D\uDE00 \t\t\t")
            } else if( i*j% 3 == 1 ) {
                print("\uD83E\uDD28 \t\t\t")
            } else if (i*j%3 == 2) {
                print("\uD83D\uDE31 \t\t\t")
            }
        }
        println()
    }


    println()
    println("DIfferent form")
    for(k in 1..numberUser) {
        for (l in 1..numberUser) {
            when(k*l%3) {
                0 -> print("\uD83D\uDE00\t")
                1 -> print("\uD83E\uDD28\t")
                2 -> print("\uD83D\uDE31\t")
            }

        }
        println()
    }

}