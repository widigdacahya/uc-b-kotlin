import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
* Handle a coroutine
*
* A .launch() call return job
*
* Allows us to manipulate coroutine lifecycle
*
* Live in hierarcy of other jobs(can be parent, children, or both)
*
* Can access lifecycle variabel and methods
* >cancel()
* >join()
*
* If a job cancelled, all its parents and children would be cancelled too
*
* */

fun main(args: Array<String>) {

    runBlocking {

        val job1 = launch {
            //delay(3000L)
            println("Job 1 Launch")

            //hieracy
            val job2 = launch {
                println("Job 2 launched")
                delay(3000L)
                println("Job 2 Finishing")
            }

            job2.invokeOnCompletion { println("Job 2 Completed") }

            val job3 = launch {
                println("Job 3 launched")
                delay(3000L)
                println("Job 3 Finishing")
            }

            job3.invokeOnCompletion { println("Job 3 competed") }

        }

        delay(500L)
        job1.invokeOnCompletion { println("Job 1 is completed :D ") }
        println("Job 1 will cancelled")

        //canceling it will cancelled whrn highest cancelld
        job1.cancel()

    }

}