fun main(args: Array<String>) {

    //var pips = listOf("Pamungkas", "Padmasari", "Prama", "Candramaya")
    //sayHelloToPeople(pips)

    //for(i in 1..5) {
    //    double(i)
    //}

    doubleAndMessage(7,"2*7 = ")
    doubleAndMessage(9)

}

fun double(number : Int) {
    println("NDouble of $number is ${number*2}")
}

fun sayHelloToPeople(people: Collection<String>) {
    for(person in people) {
        println("Hllooow $person")
    }
}

//parameter could have default parameter, like below
fun doubleAndMessage(num : Int, messg: String = "Double is") {
    println("$messg ${num*2}")
}