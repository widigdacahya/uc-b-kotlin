package com.cahyadesthian.kotlin.encapsulation

fun main(args: Array<String>) {

    val myLockEncription = EncriptionLock(40)

    println("Is it true that key 70 unlock my lock : ${myLockEncription.unlock(70)}")
    println("Is it true that key 11 unlock my lock : ${myLockEncription.unlock(11)}")
    println("Is it true that key 82 unlock my lock : ${myLockEncription.unlock(82)}")
    println("Is it true that key 73 unlock my lock : ${myLockEncription.unlock(73)}")
    println("Is it true that key 60 unlock my lock : ${myLockEncription.unlock(60)}")
    println("Is it true that key 71 unlock my lock : ${myLockEncription.unlock(71)}")



}


class EncriptionLock(private val privateKey:Int) {

    public fun unlock(publickKey: Int) : Boolean = formula(publickKey) == privateKey


    private fun formula(publickKey: Int) = publickKey/2 + 5

}