fun main(args: Array<String>) {

    var mCar = hashMapOf(Pair(1,"Mazda"), Pair(2,"Chevy"), Pair(3,"Porsche"), Pair(4, "Nissan"))
    println("The Map = $mCar")

    println("The Map Size = ${mCar.size}")

    println("Am I has Honda? ${mCar.containsValue("Honda")}")
    println("Am I has second car? ${mCar.containsKey(2)}")

    println("am I have no Car? ${mCar.isEmpty()}")
    println("Am i Have some cars availaable? ${mCar.isNotEmpty()} ")


}