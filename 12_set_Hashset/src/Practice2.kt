fun main(args: Array<String>) {

    /**
     * 1.
     * we have a set of 10 prime number
     *
     * is 21 a prime number, print thje result
     *
     * is 23 a prime? print the rresult
     * */

    var myTenPrimeNumber = setOf(2,3,5,7,11,13,17,19,23,29)
    println("Set of 10 prime number that we have $myTenPrimeNumber")
    println("Is 21 a prime number? ${myTenPrimeNumber.contains(21)}")
    println("Is 23 a prime number? ${myTenPrimeNumber.contains(23)}")

    println()
    println()

    /**
     * 2
     * You have a fo drink. Your friends also have its own
     * if you want to bougt a drink that both of you can enjoy,
     * what option do you have
     * */

    var cahyaFavDrink = hashSetOf("Coffee", "Tea", "Guava Juice", "Mangi Juice", "Coconut")
    var desthianFavDrink = hashSetOf("Coffee", "Tea", "Watermelon Juice")
    desthianFavDrink.retainAll(cahyaFavDrink)
    println("List same drink that we could enjoy is $desthianFavDrink")

}