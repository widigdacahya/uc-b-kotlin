fun main(args: Array<String>) {
    // val r = 10
    // println("The area of circle that radius $r is ${circleArea(r)}")

//    val clients = listOf<String>("Padmasari", "Candramaya", "Laksamawati", "Saraswati", "Ambarwati", "Windasari")
//    for(people in clients) {
//        println("${personalizedGreet(people)}")
//    }

    var rad = 63.0
    println("Hii, the area of circle that rad $rad is ${caclCircAre(rad)}")
}

fun circleArea(radius: Int) : Double {
    val pi = 3.14
    return pi*radius*radius
}

fun personalizedGreet(person: String) : String {

    var greeting = when(person[0]) {
        'A' -> "Hi $person, everything good?"
        'W' -> "Whatsaaap $person"
        else -> "Hi , nice day right $person"
    }

    return greeting
}

/**
 * Retunn shorthand
 * */

fun caclCircAre(numRad:Double) = 3.1415 * numRad * numRad