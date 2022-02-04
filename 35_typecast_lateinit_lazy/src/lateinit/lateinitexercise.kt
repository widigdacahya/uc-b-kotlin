package lateinit

fun main(args: Array<String>) {
    lateinit var sebuahMessage: String
    val primeNumbers = listOf(2,3,5,7,11,13,15,23)
    sebuahMessage = "The choosen one from list prime number is ${selecPrimeNumber(primeNumbers)}"
    println(sebuahMessage)
}

fun selecPrimeNumber(primes: List<Int>) = primes.random()

/*
* Defina a variable message as string
*
* Then define a list of prime numbers
*
* A function take the list of integers
* and randomly return one of the. Use it to
* initialize the message variable with
* a message including the returned prime
* number
*
* */
