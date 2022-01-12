fun main(args: Array<String>) {

    /**
     * Ask user to input a year.
     *
     * For each month of that year, print out
     * how many days there are
     *
     * assume a leap year is divisible by 4
     * */

    print("Input a year: ")
    var inputUser = readLine()?:"0"
    var numInput = inputUser.toInt()
    for(i in 1..12) {
        var month = when(i) {
            1 -> println("January | 31 days")
            2 -> {
                if(numInput%4 == 0) {
                    println("February | 29 days")
                } else {
                    println("February | 28 days")
                }
            }
            3 -> println("March | 31 Days")
            4 -> println("April | 30 Days")
            5 -> println("May | 31 Days")
            6 -> println("June | 30 Days")
            7 -> println("July | 31 Days")
            8 -> println("August | 31 Days")
            9 -> println("September | 30 Days")
            10 -> println("October | 31 Days")
            11 -> println("November | 30 Days")
            else -> println("December | 31 Days")

        }
    }


}