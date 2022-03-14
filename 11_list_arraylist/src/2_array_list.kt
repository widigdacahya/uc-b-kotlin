fun main(args: Array<String>) {

    /*
    * Arraylist is a mutable(changeable) list
    *
    * */

    var colors = arrayListOf("Red", "Green", "Blue")
    var noColors = arrayListOf<String>()
    println("var color is $colors")
    println("var noColors is $noColors")
    println(noColors::class.java)

    var listColor = listOf<String>()
    println(listColor::class.java)
    println()
    println()

    //we can add an element
    colors.add("Brown")
    println("colors afterr additoin $colors")

    //addAll form another arrayOfList
    var moreColors = arrayListOf("Light Green", "Ligt Blue", "Dark Red")
    colors.addAll(moreColors)
    println("Color after addAll from other ArrayList $colors")

    //remove an element
    var pelangi = arrayListOf("Merah", "Jingga", "Kuning", "Hijau", "Biru", "Nila", "Ungu")
    println("Pelangi = $pelangi")
    println("now i want to remove jingga by writing pelangi.remove(\"Jingga\")")
    pelangi.remove("jingga") //no element like this, thereis no exception error and no element remove
    pelangi.remove("Jingga")
    println("Now pelangin is $pelangi")

    //remove element at position
    pelangi.removeAt(0)
    println("Pelangi after remove $pelangi")

    //list that contain duplicate element, the removal will affect the first element
    var duplicateDetected = arrayListOf("Merah", "Merah", "Merah", "Hijau", "Biru", "Kuning")
    println("\nThe new duplicatedDetected $duplicateDetected, after remove Merah become :")
    duplicateDetected.remove("Merah")
    println(duplicateDetected)

    //remove all elements of collection


    //remove an element from a certain position

    println()
    println()
    var someone = ArrayList<String>()
    someone.add("Padmasari")
    someone.add("Prameswari")
    someone.add("Wiu Wiu")
    println(someone)
    println("If after for")
    for (element in someone) {
        println(element)
    }

    val pips1 = Pips("Cahya","Widigda")
    val pips2 = Pips("Prameswar","Padmasari")
    val pips3 = Pips("Trilili", "Tralalal")
    var myArrPips = ArrayList<Pips>()
    myArrPips.add(pips1)
    myArrPips.add(pips2)
    myArrPips.add(pips3)
    println()
    println()
    println("Pips Here")
    //println(myArrPips)
    for(eachOne in myArrPips) {
        println(eachOne.name)
    }


}

data class Pips (
    val name: String,
    val surename: String
)