fun main(args: Array<String>) {
    costFinal("coffee",4000.0)

    val producsts = mapOf(Pair("Cake",1000.0), Pair("Tea", 2000.0))
    costFinal(producsts)
}

/**
 * create function that takes a product name and price
 * It adds 20% tax to thath product
 * display message saying how much the product cost
 *
 *overload the function so that it takes a mp of product and proces
 * and does the same thing
 * */
fun costFinal(namePorduct: String, prices: Double?) {
    println("Product $namePorduct has price ${prices?.times(1.2)}")
}

fun costFinal(products: Map<String, Double>) {
    for (product in products.keys) {
        costFinal(product, products[product])
    }
}