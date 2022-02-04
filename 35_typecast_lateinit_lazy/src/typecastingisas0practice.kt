import kotlin.random.Random

fun main(args: Array<String>) {



    for(i in 1..10) {
        println("Itteration $i")
        var service = getNetworkSerice()
        (service as? FTPService)?.transfFile()

        println("\n")
    }



}

open class NetworkService{}
class FTPService : NetworkService() {
    fun transfFile() {
        println("Transferin a file via FTP")
    }
}

fun getNetworkSerice(): NetworkService {
    return if(Random.nextInt()%2==0)
        NetworkService()
    else
        FTPService()
}

/*
*
* An FTPService class inherits from
* the NetworkService class and ads a
* method transferFile()
*
* A function return a Network Service
*
* In the main program, invoke the function
* and if the service is of type
* FTPService, call the transferFile() function
*
* */