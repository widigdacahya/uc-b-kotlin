fun main( args: Array<String>) {
    val acceptedColor = hashSetOf("White", "Black", "Grey")
    val myColor = hashSetOf("Blue", "Red", "Black", "Green")

    println("The color allowed are $acceptedColor")
    println("In my wardrobe are $myColor")
    println()

    //var tempColor = myColor   // kalau pakai ini, myColor ikut ke retain. jadi pake addAll
    var tempColor = hashSetOf<String>()
    tempColor.addAll(myColor)
    println("tempColor $tempColor")
    tempColor.retainAll(acceptedColor)
    println("I could use color(tempColor) : $tempColor")
    println("acceptedColor $acceptedColor")
    println("myColor $myColor")
    println()

    println("Allowed color had addedd. it is red")
    acceptedColor.add("Red")
    println("So the allowed color are $acceptedColor")

    //var myAloowedColor = myColor
    var myAloowedColor = hashSetOf<String>()
    myAloowedColor.addAll(myColor)
    println("myColor $myColor")
    println("myAllowedColor $myAloowedColor")
    println("acceptedCOlor $acceptedColor")
    myAloowedColor.retainAll(acceptedColor)
    println("So now i could pick color : $myAloowedColor")
}