fun main(args: Array<String>) {
    /*
    * 1 dec;lare nullabel string, give it value
    * print out substring form position 3 to 6 (it start from 0)
    * */
    val nullabelStringIniBos: String? = "Cahyadesthian"
    println(nullabelStringIniBos?.substring(3,6))


    /*
    * 2. declae nullable double
    * multiply it by 6, connvert it to float and print it to console
    * * */
    var nulDouble:Double? = 8.9
    println(nulDouble?.times(6)?.toFloat())

    /*
    * 3. receive the nmae of the user form  console
    * print out the length
    * */

    println("Hi, type your name plz")
    var nameInput : String? = readLine()
    println("Your name is $nameInput and have ${nameInput?.length} word length")
}