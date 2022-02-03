fun main(args: Array<String>) {
    val theThing1 = TheGenericModifier<Float>()
    theThing1.proceed(314.4F)

    val thing2 = TheGenericModifier<HashMap<String,Int>>()
    thing2.proceed(hashMapOf(Pair("one",1), Pair("two",2), Pair("tthree",3)))
}

class TheGenericModifier<T> {
    fun proceed(itemProceed:T) {
        println("Item converted to string is ${itemProceed.toString()}")
    }
}