fun main(args: Array<String>) {

    /*
    * if we use a null allowed variable,
    * remeber to use the bnull operator on the function too
    * it was called as Safe Calls <3
    * */

    var catName: String? = "Pepa"
    println(catName?.length)

    catName = null
    println(catName?.length)

    //safe call can be chained for multiple operations
    var cat2Name : String? = "Shaqilla"
    cat2Name = null

    println(cat2Name?.length?.toString())
}