fun main(args: Array<String>) {
    printHello(3,"Padmasari", "Bagawanta", "Bramantya", "Chandra","Btari")
}

/**
 * create function take inr=teger var "count"
 *
 * variable number of client names
 *
 * print out "count" hello names for each client
 *
 * i.e. if count = 3, print out 3 hello messages for each client
 * */

fun printHello(count: Int, vararg names : String) {
    for(i in names) {
        for(j in 1..count) {
            print("Hello $i - ")
        }
        println()
    }
}