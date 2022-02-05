import kotlinx.coroutines.*


/**
 *  [ Scope ]
 *
 *  > provide lifecycle method , it allow us ti start and stop coroutine
 *
 *  Some kind:
 *  1. GlobalScope
 *  scope coroutine whole application
 *  cope of coroutine is the lifecycle of entire application
 *  jarang digunakan tapi palign mudah
 *
 *  2. runBlocking
 *  create scope and run coroutine an a blocking way
 *  jadi yang lain ter blok
 *
 *  3. coroutineScope
 *  create new scope,
 *  doesnt complete untill all children coroutines complete
 *
 *
 *
 *  *Note
 *   [Launch]
 *  .launch is keyword to start coroutine
 *
 * */


fun main() {

    println("Program Execution will now block")


    //it will do or lunch runBlocking first
    //if all coroutine in runBlocking finish, baru ke setelahnya runBlocking
    runBlocking{
        launch {
            delay(1000L)
            println("Task from runBlocking")
        }

        GlobalScope.launch {
            delay(500L)
            println("Task from GlobalScope")
        }

        coroutineScope {
            launch {
                delay(1500L)
                println("Task form Coroutine Scope")
            }
        }

    }

    println("Program executiob will now continue")
}