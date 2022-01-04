fun main(args: Array<String>) {
    /*
    * Elvis Operator ?:
    * it gurantees a result returned
    * either the actual result for a non-null variable or a default value
    *
    * hence, after an elvis operator, there is no need for null safety call
    * becaues elvis operator guartees a value <3
    *
    * */

    var someoneName : String? = null
    println(someoneName?:"If i am not worng it was S as the firs letter")
    println("Sentence above has ${someoneName?:"If i am not worng it was S as the firs letter".length} char length")

}