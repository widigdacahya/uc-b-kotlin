package com.cahyadesthian.apply


fun main(args: Array<String>) {

    val anAwsmKey = StrongKey().apply {
        scretCode = "onsonsokbn1241"
        carveAKey()
    }

    StrongLock().unlockTheLock(anAwsmKey)

    //Kinf od Dispossable key | it doesnt create an object
    // feel like magic key

    println()
    println()
    StrongLock().unlockTheLock(
        StrongKey().apply {
            scretCode = "theMagicIsPssst174129407"
            carveAKey()
        }
    )

}

/*
* Object lock need object key to unlock
*
* create a new key, define the secret code
* call the 'carve' function
*
* implement lock object, then call the unclock function
* with displossable key(no need store the key in a varible)
*
* */

class StrongLock() {
    fun unlockTheLock(aKey: StrongKey) {
        println("Unlocking the lock using $aKey")
    }
}

class  StrongKey {
    var scretCode = ""
    fun carveAKey() {
        println("A strong enough key to conquer and defeat a Strong key is $scretCode")
    }
}