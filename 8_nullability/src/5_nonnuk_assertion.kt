fun main(args: Array<String>) {
    /*
    * When a developer guarantee that the variable is not null
    * the sign is !!
    * WARNING : This bypassess all the languange check for null safety
    * Can trigger a program crash
    * TIP: AVOID IT AS MUCH AS YOU CAN
    * */

    val catName: String? = "Anjas"
    println(catName!!.length)

    val dogName: String? = null
    println(dogName!!.length)   //this will cause program crash because dogName is null, and the nonnull assertion guarantee it was not null that mean it was bypass by the language check 


}