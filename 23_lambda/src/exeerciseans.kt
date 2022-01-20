fun main(args: Array<String>) {
    val clients = arrayListOf("Padmasari", "Prameswari", "Andini", "Kartini")
    val msgProc = getMsg(clients) {name -> "Hello $name, hw are you ?"}
    println("Clients = $clients")
    println("Message = $msgProc")
    
    for(i in 0..clients.size-1) {
        println("Mesage for ${clients[i]}")
        println(msgProc[i])
        println()
    }
}

fun getMsg(clients: Collection<String>, theMessage:(String) -> String): ArrayList<String> {
    val messages = arrayListOf<String>()
    for(client in clients) {
        messages.add(theMessage(client))
    }
    return messages
}