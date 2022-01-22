fun main(args: Array<String>) {

    var clients = arrayListOf("Padmasari", "Prameswari", "Kartika", "Candramaya")
    var theMessage = sweetGreet(clients) {nama:String -> "Hai, Selamat Pagi $nama"}
    println(theMessage)

    println()
    for(client in clients) {
        println("Clients Name : $client")
        println("${theMessage.get(clients.indexOf(client))}")
        println()
    }



}

fun sweetGreet( clientsNames : Collection<String> , lamdaFunction: (String) -> String ): ArrayList<String?> {

    var theGreeting = arrayListOf<String?>()

    for(name in clientsNames) {
            theGreeting.add(lamdaFunction(name))
    }

    return theGreeting
}