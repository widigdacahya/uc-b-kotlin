import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/**
 * Context
 *
 * set of data traht relates on a coroutine
 *
 * all coroutine have an associated context
 *
 * Element :
 * > Dispatcher : which thread the coroutine is run on
 * > Job: handle on the coroutine lifecycle
 *
 *
 *
 * */

fun main() {


    //will run a coroutine and access a data from its context
    runBlocking {
        launch(CoroutineName("myCoroutine")) {
            println("This is run form ${coroutineContext.get(CoroutineName.Key)}")
            println("This is run form ${coroutineContext[CoroutineName.Key]}")
        }




    }

}