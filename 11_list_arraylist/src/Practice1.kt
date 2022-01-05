fun main(args: Array<String>) {

    /*
    * 1.
    * create list of favorite animal
    * print out how many animal that we have in our list
    * print second element
    * */
    var listFavAnimal = listOf<String>("Cat", "Wolf", "Eagle", "Cougar", "Fish")
    println(listFavAnimal.size)
    println(listFavAnimal.get(1))
    println(listFavAnimal[1])

    /*
    * 2.
    * make customer list
    * there is new sign up so add it to the list
    * there is someone close it account so delete the acoung
    * */

    val customers = arrayListOf("Agil", "Anjas", "Farid", "Luthfi")
    println("the customers are $customers")
    val newCustomer = "Jin"
    customers.add(newCustomer)
    println("$newCustomer come, the customer are $customers")
    val leavingCust = "Jin"
    customers.remove("Jin")
    println("FFor some reason $leavingCust need to left, so the customer now is $customers ")

}