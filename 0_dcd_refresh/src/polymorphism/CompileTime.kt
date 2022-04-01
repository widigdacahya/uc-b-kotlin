package polymorphism

open class ArtimaticAddition {
    open fun add(valueA: Int, valueB: Int) = valueA + valueB
    fun add(valueA: Long, valueB: Long) = valueA + valueB
    fun add(valueA: Int, valueB: Long) = valueA + valueB
    fun add(valueA: Long, valueB: Int) = valueA + valueB
}

/**
 * Method overloading merupakan kondisi di mana kita
 * bisa membuat 2 (dua) atau lebih fungsi yang memiliki jumlah, tipe, dan
 * urutan parameter yang berbeda di dalam sebuah class.
 * */

class Add: ArtimaticAddition(){
    override fun add(valueA: Int, valueB: Int): Int {
        println("Calculate!")

        return super.add(valueA, valueB)
    }
}

fun main(args: Array<String>) {
    val myAddition = Add()
    myAddition.add(89,21)
}