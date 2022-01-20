fun main(args: Array<String>) {

    println(theFunction(arrayListOf("Padmasari", "Candramaya","Pamungkas"))
        {names->"Awesome $names"})

}

/**
 * Create HOF that takes list of client names
 * and lambda funct return as string
 *
 * it then applies the lambda expression to
 * every client name
 *
 * create new collection of the result and retirn the result
 *
 * create lambda expression that takes client name String and
 * retun a personalized message
 *
 * Call HOF and print out result
 *
 * */

fun theFunction(clientsName: ArrayList<String>, aLmd:(String)->String) : ArrayList<String> {
    for(i in 0..clientsName.size-1) {
        clientsName[i] =  aLmd(clientsName[i])
    }
    return clientsName
}