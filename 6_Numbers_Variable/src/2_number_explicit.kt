fun main(args: Array<String>) {

    //implicitly cast to Int by Kotlin :)
    val cats = 3
    println(cats::class.java)

    // val price: Float = 2.53 //would give error, literal doesnt comfort
    val price = 2.53F
    println(price::class.java)

    val days:Short = 20000
    println(days::class.java)

    val life:Long = 70
    println(life::class.java)

    val lifeOtherType = 90L
    println(lifeOtherType::class.java)
}