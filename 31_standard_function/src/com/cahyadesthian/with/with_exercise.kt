package com.cahyadesthian.with

fun main(args: Array<String>) {

    ansSelf()
}

fun ansSelf() {

    class Store() {
        var shoesStock = 0
        var shirtsStock = 0
        var jacketStock = 0

        fun prinInv() {
            println("The Inventory has shoes: $shoesStock | shirts: $shirtsStock | jacket: $jacketStock")
        }
    }

    var myStore = Store()
    with(myStore) {
        shirtsStock = 200
        shoesStock = 100
        jacketStock = 3000

        prinInv()
    }

}