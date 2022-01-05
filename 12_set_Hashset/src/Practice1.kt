fun main(args: Array<String>) {

    /*

    1.
    create an empty set of String colors
    add three color
    remove one
    print the reslt
    * **/

    var emptySetFirst = hashSetOf<String>()
    println("1. create an empty set here $emptySetFirst")

    val aColor = listOf("Red", "Blue", "Purple", "Green", "Orange")
    emptySetFirst.addAll(aColor)
    println("2. add three color to a set, now the set become $emptySetFirst")

    val toRemove = "Orange"
    emptySetFirst.remove(toRemove)
    println("3. remove one color than become $emptySetFirst")


    println()
    println()

    /**
     * 2.
     * > Create set of object on your desk
     * > create another set that the object you wpuld to
     *   remove if you wat to clean your desk
     * > Print the remaining object
     * */

    var objectOnDesk = hashSetOf<String?>("laptop", "keyboard", "paper", "pen", "book","mouse","glass")
    println("On my deks $objectOnDesk")
    val needToClean = "paper"
    println("need to clean $needToClean")
    objectOnDesk.remove(needToClean)
    println("after cleaning the desk, remainder object are : $objectOnDesk")

}