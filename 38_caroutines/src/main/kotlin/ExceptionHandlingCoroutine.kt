import kotlinx.coroutines.*

fun main(args: Array<String>) {

//    val myHandlerException = CoroutineExceptionHandler { coroutineContext, throwable ->
//        println("Exception handled: ${throwable.localizedMessage}")
//    }

    runBlocking {

        val myHandlerException = CoroutineExceptionHandler { coroutineContext, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }

        val jobApe = GlobalScope.launch(myHandlerException) {
            println("Theowing Exception from jobApe")
            throw IndexOutOfBoundsException("exception in coroutine")
        }
        jobApe.join()


        val defferedCoruturine = GlobalScope.async {
            println("Exception form async")
            throw ArithmeticException("Exception from async")
        }

//        defferedCoruturine.await()
        try {
            defferedCoruturine.await()
        } catch (e: ArithmeticException) {
            println("Caught ArithmaticExcetion ${e.localizedMessage}")
        }



    }

}

/**
 *
 * Exception behavior depend on coroutine builder(async or launh)
 * asynch generate deffered , return value
 * launch genereate job
 *
 * > Launch:
 *  -Propagartes through the parent-child hierarcy
 *  -The exception will be thrown immediatlly and jobs will fail
 *  -Use try-catch or an exception handler
 *
 *  > Async
 *  -Exception are defrred until the result is consumed
 *  -If the result is not consumed, the exception is never thrown
 *  -try catch in the coroutine or in the await() call
 *
 *
 */
