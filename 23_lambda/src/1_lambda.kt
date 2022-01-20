/**
 * Lambda
 *
 * > lambda is an anonymous function(has no name)
 * > lambda can have paramater
 * > can be assigned to a vareiable
 * > could be use as parameter to a new function(higher order function)
 * */
fun main(args: Array<String>) {
    val myLambda = {name: String -> println("Hello $name") }
    println(myLambda) //it print out (kotlin.String) -> kotlin.Unit
}