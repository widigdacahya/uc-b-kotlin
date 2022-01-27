package Exercise

fun main(args: Array<String>) {
    var calc = Calculator()
    calc.add(10.0)
    calc.mul(10.0)
    calc.div(25.0)
    calc.sub(1.0)
    calc.reset()
}

class Calculator {

    var total = 0.0

    fun add(a:Double) {
        total += a
        println("+ $a")
        println("= $total")
    }

    fun sub(a: Double) {
        total -= a
        println("- $a")
        println("= $total")
    }

    fun mul(a: Double) {
        total *= a
        println("* $a")
        println("= $total")
    }

    fun div(a: Double) {
        total /= a
        println("/ $a")
        println("= $total")
    }

    fun reset() {
        total = 0.0
        println("= $total")
    }

}