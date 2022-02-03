package com.cahyadesthian.enum

fun main(args: Array<String>) {

    var olympics = Olympics()
    println(olympics.getMedal(2))
    println(olympics.getMedal(5))
    println(olympics.getPositon(Medal.GOLD))


}

enum class Medal(val position: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

class Olympics {
    fun getMedal(position: Int) : Medal {
        return when(position) {
            1->Medal.GOLD
            2->Medal.SILVER
            3->Medal.BRONZE
            else->Medal.NONE
        }
    }

    fun getPositon(medal:Medal) = medal.position
}