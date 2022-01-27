package consturctor

import kotlin.random.Random

fun main(args: Array<String>) {
    val correctKey = Lock.createKey()
    val myLock = Lock(correctKey)
    myLock.unlock(correctKey)


    val randKey = Lock.createKey()
    myLock.unlock(randKey)

    println()
    println("If randkey to new lock")
    val newLock = Lock(randKey)
    newLock.unlock(randKey)
}

class Lock(key: Key) {

    var secretCode : String = ""

    init {
        secretCode = generateSecret()
        //println(secretCode)
        key.scretCOde = secretCode
        println("Init was called")
    }

    //create key without make object
    companion object {
        fun createKey() = Key()
    }

    //generate random
    fun generateSecret(): String {
        return  Random(System.currentTimeMillis()).nextInt().toString()
    }

    fun unlock(key: Key) {
        if(key.scretCOde == secretCode)
            println("Lock is open")
        else
            println("Key is not correct")
    }
}

class Key {
    var scretCOde : String = ""
    //when we set it, we cant change it, use setter
        set(value) {
            if(field == "")
                field = value
        }


}