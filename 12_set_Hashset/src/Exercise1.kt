fun main(args: Array<String>) {
    /**
     * There is alist of customer of our online store
     *
     * new customer joined
     *
     * print the list of customer
     *
     * a customer cosen to leacve
     *
     * print the list of customer
     *
     * */


    // Version 1 : using variable
    // Version 2 : using readLine input

    // [ Version 1 ]
    var listOfCustomer = hashSetOf("Padmasari", "Prameswari", "Candramaya", "Bratarini", "Ambarsari", "Arawinda")
    println("First cusotmer is $listOfCustomer")

    val newCustomer = "Astagina"
    println("Hi, $newCustomer has come, welcome!")
    listOfCustomer.add(newCustomer)

    println("Now the customer are $listOfCustomer")

    println("...")
    println("...")
    println("...")
    println("Padmasari need to leave because of something ")
    listOfCustomer.remove("Padmasari")
    println("Customer here $listOfCustomer")


    //[ Version 2 ]
    var cahyaCustomer = hashSetOf("Cahyaningrum", "Cempaka", "Candrarini", "Danastri")
    println("Hi this is our customer today : $cahyaCustomer")
    println("Someone come ? ")
    var aNewCustomerCome = readLine()?:""
    cahyaCustomer.add(aNewCustomerCome)
    println("Okay great, now the customer are $cahyaCustomer")
    println("...")
    println("...")
    println("a Customer need to go home : ")
    val aGoHome = readLine()?:""
    cahyaCustomer.remove(aGoHome)
    println("Now, customer in store is $cahyaCustomer")

}