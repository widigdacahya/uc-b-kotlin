fun main(args: Array<String>) {
    /**
     *  Hashmap is mutable map
     * */

    var aListOfGunn = hashMapOf(Pair(1,"Pistols"), Pair(2,"SMG"), Pair(3,"Rifle"), Pair(4, "Machine Gun"), Pair(5,"Sniper"))
    println("We have a gun list : $aListOfGunn ")

    //adding a key -value pair
    aListOfGunn.put(7, "Grenade")
    println("We add grenade, so the list become $aListOfGunn")

    //adding al element of another map
    var newArrivalGun = mapOf<Int,String>(Pair(6,"Dual-Smg"), Pair(8, "Knife"))
    println("There is new arrival gun : $newArrivalGun , let's add this tou ours")
    aListOfGunn.putAll(newArrivalGun)
    println("Our Gun now $aListOfGunn")
    println()

    //remove
    println("There is new rule to keep some gun :( ,so we need to remove a Knife")
    aListOfGunn.remove(8)
    println("Our gun now $aListOfGunn")
    println()

    //replace value
    println("want to remove dualsmg and change it place for dal rifle ")
    aListOfGunn.replace(6, "Dual-Rifle")
    println("Our updated inventory of gun $aListOfGunn")
    println()

    //remove all
    println("new rule, no gun")
    aListOfGunn.clear()
    println("Our invntory now $aListOfGunn ")
}