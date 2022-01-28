package com.cahyadesthian.kotlin.encapsulation

fun main(args: Array<String>) {
    val aFranchise = Franchise()
    aFranchise.prepareBurger()
}

open class Restaurant(){
//    private val topSecretFormula = "Nothing"
//
//    fun sell() {
//        println("Here your burger")
//    }

    protected fun applyFormula(): String {
        return "Prepare burger with love and care"
    }


}

class Franchise: Restaurant() {

    fun prepareBurger() {
        println("Preparing your burger according to the secret formula")
        println(applyFormula())
        println(super.applyFormula())
    }
}

