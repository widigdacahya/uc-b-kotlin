fun main(args: Array<String>) {
    bankBaik(hashMapOf(Pair("Cempaka", 200.0), Pair("Cendana", 100.2), Pair("Cakrawala", 50.0)))
}

/**u
 * Create function that take map of user and their bank balance
 * insisde of thath function, create a function that takes a number and return its double
 *
 * double each user's bank balance and print out a statement
 * */
fun bankBaik( users:HashMap<String, Double?>) {

    fun doubleAmount(theNum : Double?) : Double? = theNum?.times(2)

    println("before fun $users")

    for(user in users.keys) {
        users[user] = doubleAmount(users[user])
    }

    println("after fun $users")

}