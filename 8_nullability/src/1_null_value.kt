fun main(args: Array<String>) {

    /**
     * Null Value = The Billion doollar Mistake
     * No Value Present
     * If we see a variable with null value, our program will crash
     * with a NullPointerException
     *
     * --Kotlin guards against Null Values
     * --
     * Kotlin membedakan variable yang bisa bernilai null dan yang tidak bisa bernilai null
     * dengan cara menggunakan operator ?
     * val herName : String = "Padmasari" <---- variable ini ndak bisa bernilai null k
     * val hisName : String? = null <----- variable ini boleh null, indikatornya adanya tanda ?
     *
     * ketika sebuah variable tidak boleh null, maka harus diberi nilai
     * ketika sebuah variable diperbolehkan bernilai null, nilai yang idberikan optional tapi harus
     * diberitahui dulu kalau null
     */

    val herName : String = "Padmasari"
    val hisName : String? = null
    println(herName) //it printed Padmasari
    println(hisName) //it printed null

    var catName: String? = "Caty"
    println(catName)
    catName = null
    println(catName)

    var dogName = "Spike"
    //dogName = null   //it would give us error null cannt be a value of non null type string

}