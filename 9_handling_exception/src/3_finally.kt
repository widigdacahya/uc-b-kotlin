import java.lang.Exception

fun main(args:Array<String>) {

    /*
    * this block will be executed whether or not an exception occurs
    * */

    val test = readLine()
    try{
        println(test?.toInt())
    } catch (e:Exception) {
        println("an Exception happen")
        e.printStackTrace()
    } finally {
        println("the exceuiotn completed, this is form finnaly block")
    }

    /*
    *
    * try {
    *   // try to do something
    * } catch(e:Exception) {
    *   // if an exception occured
    * } finally {
    *   // always execute this part
    * }
    * */


}