package com.cahyadesthian.data

fun main(args: Array<String>) {

    var customers = arrayListOf<OurLovelyCustomer>()

    customers.add(OurLovelyCustomer("Pramewswari","prmswr@gmail.com",99))
    customers.add(OurLovelyCustomer("Padmasari", "pdmsri@gmail.com", 90))
    customers.add(OurLovelyCustomer("Cahyadesthian", "chy@gmail.com", 120))
    println("Good day, our cust is : $customers")


    println()
    println("Soemone COmes")
    val newCust = customers[2].copy(email = "widigda@gmail.com")
    customers.add(newCust)

    println("Aeesome.now customers are: ")
    println(customers)

    sendToEmail(customers)
}

fun sendToEmail(ourCustomer: ArrayList<OurLovelyCustomer>) {
    ourCustomer.forEach {
        println("Sending warm greeting ti ${it.email}")
    }
}

data class OurLovelyCustomer(
    val name: String,
    val email: String,
    val productBought: Int
)