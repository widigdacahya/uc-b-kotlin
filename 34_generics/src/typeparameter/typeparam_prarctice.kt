package typeparameter

fun main(args: Array<String>) {
    val printerInfo1 = PrintInfo<Set<String>>()
    printerInfo1.iterateCollection(hashSetOf("Agniasari", "Btari","Candramaya","Damayanti","Estiningtyas", "Feby", "Gita", "Hesti", "Indraswari"))


    println()
    val printInfo2 = PrintInfo<List<String>>()
    printInfo2.iterateCollection(listOf("Mahsewari", "Maharani", "Mayang", "Nareswari", "Nindy", "Puspaningtyas", "Ratimaya", "Saraswati", "Utami", "Widyawati", "Yulianti"))


}

class PrintInfo<T:Collection<String>> {

    fun iterateCollection(collection: T) {
        collection.forEach {
            println(it)
        }
    }

}

