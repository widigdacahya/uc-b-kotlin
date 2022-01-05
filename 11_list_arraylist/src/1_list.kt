fun main(args: Array<String>) {
    /*
    *  List
    *   > Ordered Collection that contain duplicate elements
    *   > If we create empty list, need  to specify the type of element
    *   > A list can contain duplicate elements
    *   > can contain nulls
    *
    * */

    var colors = listOf("Red", "Orange", "Yellow", "Green", "Blue", "Purple")
    println(colors)

    //empty list need to specify type of elemet
    var colors2 = listOf<String>()
    println(colors2)

    //duplicate elemnt allowed
    var catColor = listOf("Orange", "White", "Black", "Orange", "White and Black")
    println(catColor)

    //can contain null
    var carColor = listOf("Black", "Silver", "Prussian Blue", null)
    println(carColor + "->Ypw this is car color")
    println(carColor::class.java)

    //retrieve an Element
    var listOfColorinCrayon = listOf("White","Yellow", "Orange", "Green", "Red", "Blue", "Gray", "Brown", "Black")
    println("The list of listOfColorinCrayon is $listOfColorinCrayon")
    println(listOfColorinCrayon[2])
    println(listOfColorinCrayon[0])
    println(listOfColorinCrayon.get(1)) //same llike listOfColorinCrayon[1]

    //if we try to acces index more than it size, ther will exception outOfBound
    try {
        println(listOfColorinCrayon[20])
    } catch (e:Exception) {
        println("Heei what arw you printin :) ")
        e.printStackTrace()
    }

    //ertrive the list
    println(listOfColorinCrayon.size)

}