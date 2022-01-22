/**
 * High Order Function
 * a HOF is a function thath
 * takes another function as parameter
 *
 * */

fun main(args: Array<String>) {
    //val names = arrayListOf("Padmasari", "Prameswari", "Cempaka", "Candramaya")
    //val myLambda = {name: String -> println("Hello there $name") }
    //sayHello(names,myLambda)
    //code above can be written like below (the lambda not in bracket and ArrayList on func)

    //sayHello(arrayListOf("Padmasari", "Prameswari", "Cempaka", "Candramaya")) {name:String -> println("Hellow there $name") }

    menyapaPipel(arrayListOf("Candramaya", "Agniasari", "Padmasari")) { nama: String -> println("Halo peeps bernama $nama") }
}

fun sayHello(names: ArrayList<String>, doSomethin: (String) -> Unit) {
    for (name in names) {
        doSomethin(name)
    }
}

// below called as High Order Function
/**
 * Unit return could be understand as no return :)
 * */
fun menyapaPipel(namaOrang: ArrayList<String>, aLambdaFunction:(String)->Unit) {
    for(nama in namaOrang) {
        aLambdaFunction(nama)
    }
}