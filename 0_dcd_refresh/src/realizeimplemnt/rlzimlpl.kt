package realizeimplemnt

interface ProductService {
    fun getProduct(id: String)
    fun calculatePriceOfProduct()
}

//here kinnd of implementation the interface of product service
class MySHop(): ProductService {
    override fun getProduct(id: String) {
        TODO("Not yet implemented")
    }

    override fun calculatePriceOfProduct() {
        TODO("Not yet implemented")
    }

}