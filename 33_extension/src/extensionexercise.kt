fun main(args:Array<String>) {
    val myList = arrayListOf(2,4,5,1,2,5,6,7,1,2,5,6)

    println(myList.tellInfoElements())
}

fun ArrayList<Int>.tellInfoElements() = "This lis contain $size elements"