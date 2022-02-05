import kotlinx.coroutines.*

fun main(args: Array<String>) {

    runBlocking {
//        launch(Dispatchers.Main) {
//            println("Main dispatcher. Thread: ${Thread.currentThread().name}")
//        }

        launch(Dispatchers.Unconfined) {
            println("Unconfined1. Thread: ${Thread.currentThread().name}")
            delay(100L)
            println("Unconfinred2. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default. Thread: ${Thread.currentThread().name}")
        }


        launch(Dispatchers.IO) {
            println("IO. Thread: ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("TheMyTHread")) {
            println("New SIngle Thread Context. Thread: ${Thread.currentThread().name}")
        }

    }

}

/*
*
* Determine which thread or thread pool coroutine run on
*
* different dispatecher are available depending the task specify
*
* Common Dispatcher:
* 1. Main
* main thread update in UI drive application(e.g Android)
* main dispatcher need to be defiend Gradle
*
* 2. Default
* Useful for CPU intensive work
* like data processing, image processung
*
* 3. IO
* useful for network communication or reading/writing files
*
* 4. Unconfineed
* start the coroutine in the inherited dispatcher that called it
* system decide for us
*
* 5. newSingleThreadContext("MyThread")
* forces creaeted of a new thread
*
*
*
* */