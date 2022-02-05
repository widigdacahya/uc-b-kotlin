import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

/**
 *Allows us to easily change context
 *
 * Easily switch betwween dispatcher
 *
 * very lightweigth
 */

fun main() {
    runBlocking {
        launch(Dispatchers.Default) {
            println("First Context $coroutineContext")
            withContext(Dispatchers.IO) {
                println("Secon context $coroutineContext")
            }
            println("Third Context : $coroutineContext")
        }
    }
}
