fun main(args: Array<String>) {

    /*
    * Mutable set = hashSet
    * */

    val aNumberSet = hashSetOf<Int?>(2,4,3,5,6,8,7,8,9,12,11,10,null)
    val noNumberinSet = hashSetOf<Int>()

    println("val aNumber set " + aNumberSet)    // the order become ordered
    println("val noNumberinSet " + noNumberinSet)

    //add element to a set
    noNumberinSet.add(13579)
    noNumberinSet.add(87)
    noNumberinSet.add(35)
    println("val noNumberinSet " + noNumberinSet)

    //addd another set
    val newSetNumber = hashSetOf(1,2,5,634,234,3,1,2)
    noNumberinSet.addAll(newSetNumber)
    println("val noNumberinSet " + noNumberinSet)

    val heiNewSetHere = hashSetOf<Int?>(null,123,53)
    println("this is newVal of heiNewSetHere " + heiNewSetHere)
    val toRemove = null
    heiNewSetHere.remove(toRemove)
    println("this is newVal of heiNewSetHere " + heiNewSetHere)

    val aNewSet = hashSetOf<Int?>(45,12,6456,13261,98984,1651,1321, null)
    println("We have aNewSet $aNewSet")
    aNewSet.removeAll(aNewSet)
    println(aNewSet)

    val anotherSet = hashSetOf(124,235,663,2134)
    println(anotherSet)
    anotherSet.remove(45)
    anotherSet.remove(124)
    println(anotherSet)


}