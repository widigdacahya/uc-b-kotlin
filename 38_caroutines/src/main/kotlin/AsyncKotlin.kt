import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

/*
* Another way to star coroutine
*
* Just like launch but it return result
*
* the result in the form of deferred
*
* deferred - a future promise oa a returned value
*
* when w eneed the value, we call await()
* await is blocking call
* when value is available, it will return immediately
* if value is not avaliable, it will pause the thread until it is ready
*
*
*
* */


fun main(args: Array<String>) {

    runBlocking {
        val firstDeffered = async { getFirstValue() }
        val secondDeffere = async { getSecondValue() }

        println("Somep proceessing are run")
        delay(500L)
        println("Waiting for values")
    
        val firstValueGotten = firstDeffered.await()
        val secondValueGottern = secondDeffere.await()


        println("Total of first($firstValueGotten) and second($secondValueGottern) val is ${firstValueGotten + secondValueGottern}")
    }

}

suspend fun getFirstValue(): Int {
    delay(1000L)
    val aValueRandFirstVal = Random.nextInt(100)
    println("Returning first value $aValueRandFirstVal")
    return aValueRandFirstVal
}

suspend fun getSecondValue(): Int {

    delay(2000L)
    val theSeconValeRand = Random.nextInt(2000)
    println("Returnin second value $theSeconValeRand")
    return theSeconValeRand

}