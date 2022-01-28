package com.cahyadesthian.kotlin.polymorphism

fun main(args: Array<String>) {
    val television = Tv()
    television.getChannel("5")
    television.getChannel("1", true)
    television.getChannel("5", 12)
}

class Tv {
    fun getChannel(idChannel: String) {
        println("Regular broadcast for channel id $idChannel")
    }

    fun getChannel(id: String, subtitle: Boolean) {
        print("Regular boadcast for channel id $id ")
        if(subtitle) {
            println("With Subtutler")
        } else {
            println("No subtitle")
        }
    }

    fun getChannel(idChanl : String, time: Int) {
        println("Broadcast for channel id $idChanl at $time time")
    }

}