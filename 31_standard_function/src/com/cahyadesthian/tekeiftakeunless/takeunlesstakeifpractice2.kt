package com.cahyadesthian.tekeiftakeunless

fun main(args: Array<String>) {

    val goodClientNameJavanese = listOf("Padmasari", "Prameswari","Agniasari", "Anindita", "Cahyaningrum", "Cahyani","Bratarini")
    println("Our Javanase name of client identified is : ")
    println(goodClientNameJavanese)

    val withoutAName = arrayListOf<String>()
    for(name in goodClientNameJavanese) {
        name.takeUnless { it[0] == 'A' }
            ?.let { withoutAName.add(it) }
    }
    println()
    println("Without A")
    println(withoutAName)

}