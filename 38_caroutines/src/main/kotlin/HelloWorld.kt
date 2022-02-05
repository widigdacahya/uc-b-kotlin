import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    /*
    *
    * This code is executed in parralel
    * it contains 2 part
    * that executed at he same time
    * */

    //--------[ Part 1 ]--------------
    // This is make a scope
    // and lauch the coroutin
    GlobalScope.launch {
        delay(4000L)
        println("World !")
    }
    //--------[ Closing Part 1 ]--------------


    //--------[ Part 2 ]--------------
    print("Hello, ")
    Thread.sleep(10000L)
    //--------[Closing Part 2 ]--------------
}