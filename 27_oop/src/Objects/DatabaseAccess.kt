package Objects

/**
 * Object is static Class
 * Think like SIngleton in Design Patter
 *
 * Class can be instantiated, the instance called as Object
 *
 * An Object is a static class, all method and variable can be accessed without an instance <3
 *
 * */

fun main(args: Array<String>) {

    //DatabaseAccess.connected = true

    if(DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }

    println("The database connection is connected : ${DatabaseAccess.connected}")

}

object DatabaseAccess {
    var connected = false

    fun connect() {
        connected = true
        println("Connected to the database")
    }

    fun disconnect() {
        connected = false
        println("Disconnected from database")
    }

}