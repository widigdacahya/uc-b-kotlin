fun main(args: Array<String>) {

    val theInfo = Info<String>()
    theInfo.getLength("A String")

    println()
    val theInfo2 = Info<Double>()
    theInfo2.getLength(241.45)

    println()
    val theInfo3 = Info<ArrayList<Int>>()
    theInfo3.getLength(arrayListOf(1, 2)) //per angka nilainya 3, but why?

}

/*
* Create class that generic type
* has function take olment of type T
* Convert it to a String
* print the lengt of sting
*
* create different object of thath class
* and invoke the function
* */

class Info<T> {
    fun getLength(item: T) {
        println(item.toString().length)
    }
}