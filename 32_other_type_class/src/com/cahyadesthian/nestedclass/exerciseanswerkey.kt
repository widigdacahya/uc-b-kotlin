package com.cahyadesthian.nestedclass

fun main(args: Array<String>) {

    val cahyaAwesomePlane = AwesomePlane()
    cahyaAwesomePlane.takeOffAwesomePlane()

}

class AwesomePlane{

    private val engine1 = Engine("Engine 1")
    private val engine2 = Engine("Engine 2")

    fun takeOffAwesomePlane() {
        println("Getting On Enginee")
        engine1.startAwesomePlaneEngine()
        engine2.startAwesomePlaneEngine()
        println("Taking Aweoseme Plane OFF")

    }

    private inner class Engine(val engineName: String) {
        fun startAwesomePlaneEngine() {
            println("$engineName is ON")
        }
    }

}