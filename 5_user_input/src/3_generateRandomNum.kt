import kotlin.random.Random

fun main(args: Array<String>) {
    //very random
    println(Random.nextInt())

    //form 0 until a number, number itself did not included
    println(Random.nextInt(8))

    //from a number(this included), until a number(it doesnt included)
    println(Random.nextInt(90,93))

    //double
    println(Random.nextDouble(0.5, 1.0))
}