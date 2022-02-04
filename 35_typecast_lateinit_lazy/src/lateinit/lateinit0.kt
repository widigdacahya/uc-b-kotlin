package lateinit

fun main(args: Array<String>) {

    lateinit var networkService: String
    networkService = getNetworkServiceString()
    println(networkService)

}

fun getNetworkServiceString() = "--- a Network Service ---"

/*
*
* Allow us to create non null, non intialized variable
*
* Need to initialize the variable before using it
*
* Accessing it before initializing it throws an exception
*
* Can be used on var variable
*
* Use .isInitialized to check initializtion
* like flag
*
*
* Common use case :
* > Dependency Injection
* > Unit Testing
*
* */


