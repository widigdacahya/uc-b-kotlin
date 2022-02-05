import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
* Suspending Function
*
* a function that can run in coroutiene
*
* benefit:
* > make callback seamless
*
* */

//track suspended function hwmany times
var functionCalls = 0

fun main(args: Array<String>) {

    GlobalScope.launch { completeMessage() }

    GlobalScope.launch { improveMessage()  }

    print("Hello, ")
    Thread.sleep(10000L)
    println("There have been $functionCalls call till this time")

}

//it would be  part of coroutine
suspend fun completeMessage() {
    delay(5000L)
    println("World !")
    functionCalls++
}

suspend fun improveMessage() {
    delay(6000L)
    println("Suspend Functions are awesome")
    functionCalls++
}

