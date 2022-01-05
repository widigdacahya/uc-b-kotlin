fun main(args: Array<String>) {
    /*
    * all LIST function can be applied to arrayList
    * but not vice versa
    *
    * */

    val amazingCar = arrayListOf("Mazda", "Chevy", "Nissan", "BMW", "Mercy", "Honda")
    println("This is ArrayList of Amazing Brand Car $amazingCar")
    println(amazingCar::class.java )
    println()


    amazingCar.set(0, "Lion Logo")
    println("after set become $amazingCar")
    println(amazingCar::class.java)
    println()


    amazingCar.subList(0,4)
    println("The sublist become $amazingCar")
    println(amazingCar::class.java)
    println()

    amazingCar.clear()
    println(amazingCar)
    println(amazingCar::class.java)

    println(amazingCar.isEmpty())


}