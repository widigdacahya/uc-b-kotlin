package com.cahyadesthian.nestedclass

fun main(args: Array<String>) {

    var chayaAirplane = Airplane()
    chayaAirplane.takeOff()

}

class Airplane {

    val engineOne = EngineOne()
    val engineTwo = EngineTwo()


    fun takeOff() {
        engineTwo.runningEngineTwo()
        engineOne.runningEnggine()
    }

    inner class EngineOne {
        fun runningEnggine() {
            println("Engine One On Task")
        }
    }

    inner class EngineTwo {
        fun runningEngineTwo() {
            println("Engine Two on Task")
        }
    }


}

