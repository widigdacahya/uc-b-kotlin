fun main(args: Array<String>) {

    var i = 0
    while(i<10) {
        i++
        println("Hello, this is grreeting-$i")
    }

    /**
     * we have 5 cats
     * (tigger,smokey,sassy,patch, sammy)
     * print hello for each cat
     * */

    println()
    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
    var indx = 0
//    println(cats.size)
    while(indx < cats.size) {
        println("Hello, Have a great day ${cats[indx]}")
        indx++
    }


    /***
     * Print faktoiral using
     * while loop
     */

    println()
    print("Enter a number : ")
    val userInput = readLine()?:""
    var usernmbr = userInput.toInt()

    var traverse = 1
    var res = 1L    //Long is used to prceed big number such as 20!

    while(traverse <= usernmbr) {
        res *= traverse
        traverse++
    }
    println("$usernmbr! = $res")

}