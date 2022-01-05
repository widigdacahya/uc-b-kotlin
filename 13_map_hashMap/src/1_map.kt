fun main(args: Array<String>) {

    /**
     * Map like a dicitionary, there is a pair
     * a pair that has a Key and Value relationship
     * */

    //Keys are unique, values can be duplicated
    var aMapofNumber = mapOf(Pair(1, "One"), Pair(2, "Two"), Pair(3, "Three"))
    println("The firsmt map of aMapofNumber is $aMapofNumber")


    //like usual , create an emptyMap need specify the type
    var anEmptyCount = mapOf<Int,String>()
    println(anEmptyCount)

    //get value based in aky
    println("From the aMapofNumber, the value of key 2 is ${aMapofNumber.get(2)}")
    println("From the aMapofNumber, the value of key 2 is ${aMapofNumber[2]}")

    //get all the keys
    println("The map aMapofNumber have keys : ${aMapofNumber.keys}")

    //gel all values
    println("The map aMapofNumber have values : ${aMapofNumber.values}")

}