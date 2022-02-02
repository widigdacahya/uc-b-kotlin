package com.cahyadesthian.run

fun main(args: Array<String>) {
    run {
        var ourRestauran = OwnRestaturant()
        ourRestauran.standarDish.add("Carrot")
        ourRestauran.todatSpecial.add("Fried Crispy Mushroom")
        ourRestauran.printOutMenu()
    }
}



class OwnRestaturant {

    var standarDish = arrayListOf("Soup", "Spinach", "Salad")

    var todatSpecial = arrayListOf("Cap Jay", "Fuyung Hai")

    fun printOutMenu() {
        println("Welcome :) ")
        println("------------")
        println("Our Menu : ")
        println(standarDish)
        println("Todays Special : ")
        println(todatSpecial)
    }

}
