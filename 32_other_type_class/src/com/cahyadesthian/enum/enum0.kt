package com.cahyadesthian.enum

/*
* DEFINE CONSTANT
* */

fun main(args: Array<String>) {
    val color = Colors.GREEN
    when(color) {
        Colors.BLUE -> println("You get Blue")
        Colors.RED -> println("Red Picked Up")
        Colors.GREEN -> println("Green gotposition")
    }

    println(Warna.BIRU.timeUsed)
    println(Warna.MERAH.name)
    println(Warna.HIJAU.ordinal)//start from zero
}

/*
*
* Enum constants can be intialized
*
* COnstan can have porperties(like name,ordinal)
*
* */

enum class Colors {
    RED,
    GREEN,
    BLUE
}

enum class Warna(val timeUsed:Int) {
    MERAH(8),
    BIRU(89),
    HIJAU(99)
}